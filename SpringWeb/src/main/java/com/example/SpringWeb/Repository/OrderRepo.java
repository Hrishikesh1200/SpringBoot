package com.example.SpringWeb.Repository;

import com.example.SpringWeb.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
    // Derived query method
    List<Order> findByCustomerName(String customerName);

}
