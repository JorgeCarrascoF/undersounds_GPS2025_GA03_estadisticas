package io.swagger.service;

import io.swagger.model.MerchItem;
import io.swagger.model.MerchItemResponse;
import io.swagger.model.Order;
import io.swagger.model.OrderItem;
import io.swagger.repository.OrderRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

  private final OrderRepository orderRepository;
  private final RestTemplate restTemplate = new RestTemplate(
    new HttpComponentsClientHttpRequestFactory()
  );
  private final String servicioContenidoUrl;

  public OrderService(
    OrderRepository orderRepository,
    @Value("${service.contenido.url}") String servicioContenidoUrl
  ) {
    this.orderRepository = orderRepository;
    this.servicioContenidoUrl = servicioContenidoUrl;
  }

  public List<Order> getAllOrders() {
    return orderRepository.findAll();
  }

  public Order getOrderById(String id) {
    return orderRepository.findById(id).orElse(null);
  }

  public List<Order> getOrdersByUser(String id) {
    return orderRepository.findByUserId(id);
  }

  public Order createOrder(Order order) {
    // Generar orderId automáticamente si no viene o está vacío
    if (order.getOrderId() == null || order.getOrderId().isEmpty()) {
      order.setOrderId(UUID.randomUUID().toString());
    }

    // Decrementar stock de los items del pedido
    for (OrderItem item : order.getItems()) {
      if (!item.getType().equals("album")) {
        decrementMerchItemStock(item.getProductId(), item.getQuantity());
      }
    }

    return orderRepository.save(order);
  }

  public void deleteOrder(String id) {
    if (!orderRepository.existsById(id)) {
      throw new RuntimeException("Order not found");
    }
    orderRepository.deleteById(id);
  }

  private void decrementMerchItemStock(String merchItemId, Integer quantity) {
    try {
      String url = servicioContenidoUrl + "/merch/" + merchItemId;
      MerchItemResponse response = restTemplate.getForObject(
        url,
        MerchItemResponse.class
      );
      MerchItem item = response != null ? response.getData() : null;
      if (item != null) {
        Integer newStock = item.getStock() - quantity;
        Map<String, Integer> requestBody = new HashMap<>();
        requestBody.put("stock", newStock);
        restTemplate.patchForObject(url, requestBody, Void.class);
      }
    } catch (Exception e) {
      System.out.println(
        "Error decrementing stock for merch item " +
        merchItemId +
        ": " +
        e.getMessage()
      );
    }
  }
}
