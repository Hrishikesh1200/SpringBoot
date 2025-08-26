package com.example.SpringWeb.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CurrentTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity

@Table(name = "orders")
public class Order {
    @Id
    private int orderNum;
    private String customerName;
    private String orderType;
    private Timestamp time;

    public Order() {
        // Automatically set current timestamp when order is created
        this.time = Timestamp.valueOf(LocalDateTime.now());
    }

    public Order(String customerName, String orderType) {
        this.customerName = customerName;
        this.orderType = orderType;
        this.time = Timestamp.valueOf(LocalDateTime.now());
    }


}
