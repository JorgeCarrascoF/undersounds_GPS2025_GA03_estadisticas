package io.swagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.swagger.model.Order;

public interface OrderRepository extends JpaRepository<Order, String> {
    List<Order> findByUserId(String userId);

    @Query("SELECT COALESCE(SUM(oi.quantity), 0) FROM Order o JOIN o.items oi WHERE oi.productId = :albumId AND oi.type = 'album'")
    Integer countAlbumSales(@Param("albumId") String albumId);

    @Query("SELECT COALESCE(SUM(oi.quantity), 0) FROM Order o JOIN o.items oi WHERE oi.productId = :merchId AND oi.type = 'merch'")
    Integer countMerchSales(@Param("merchId") String merchId);
}