package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OrderItem;
import io.swagger.v3.oas.annotations.media.Schema;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-10-23T09:58:42.026149969Z[GMT]")
@Entity
@Table(name = "orders")
public class Order   {
  @JsonProperty("orderId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.SKIP)    // SKIP setting if the value is null (permite null/vacío)
  @Id
  private String orderId = null;

  @JsonProperty("userId")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String userId = null;

  @JsonProperty("orderDate")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private OffsetDateTime orderDate = null;

  @JsonProperty("totalAmount")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private BigDecimal totalAmount = null;

  @JsonProperty("items")
  @Valid
  @ElementCollection
  private List<OrderItem> items = null;

  public Order orderId(String orderId) { 

    this.orderId = orderId;
    return this;
  }

  /**
   * ID de la compra
   * @return orderId
   **/
  
  @Schema(example = "order001", description = "ID de la compra")
  
  public String getOrderId() {  
    return orderId;
  }



  public void setOrderId(String orderId) { 
    this.orderId = orderId;
  }

  public Order userId(String userId) { 

    this.userId = userId;
    return this;
  }

  /**
   * ID del usuario que realiza la compra
   * @return userId
   **/
  
  @Schema(example = "user001", description = "ID del usuario que realiza la compra")
  
  public String getUserId() {  
    return userId;
  }



  public void setUserId(String userId) { 
    this.userId = userId;
  }

  public Order orderDate(OffsetDateTime orderDate) { 

    this.orderDate = orderDate;
    return this;
  }

  /**
   * Get orderDate
   * @return orderDate
   **/
  
  @Schema(example = "2025-10-07T20:50+02:00", description = "")
  
@Valid
  public OffsetDateTime getOrderDate() {  
    return orderDate;
  }



  public void setOrderDate(OffsetDateTime orderDate) { 
    this.orderDate = orderDate;
  }

  public Order totalAmount(BigDecimal totalAmount) { 

    this.totalAmount = totalAmount;
    return this;
  }

  /**
   * Precio total de la compra
   * @return totalAmount
   **/
  
  @Schema(example = "14.5", description = "Precio total de la compra")
  
@Valid
  public BigDecimal getTotalAmount() {  
    return totalAmount;
  }



  public void setTotalAmount(BigDecimal totalAmount) { 
    this.totalAmount = totalAmount;
  }

  public Order items(List<OrderItem> items) { 

    this.items = items;
    return this;
  }

  public Order addItemsItem(OrderItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<OrderItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Productos comprados
   * @return items
   **/
  
  @Schema(description = "Productos comprados")
  @Valid
  public List<OrderItem> getItems() {  
    return items;
  }



  public void setItems(List<OrderItem> items) { 
    this.items = items;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.userId, order.userId) &&
        Objects.equals(this.orderDate, order.orderDate) &&
        Objects.equals(this.totalAmount, order.totalAmount) &&
        Objects.equals(this.items, order.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, userId, orderDate, totalAmount, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
