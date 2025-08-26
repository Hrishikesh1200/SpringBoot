package com.example.SpringWeb.service;

import com.example.SpringWeb.Exception.OrderNotFoundException;
import com.example.SpringWeb.Repository.OrderRepo;
import com.example.SpringWeb.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepo or;

   public void giveOrder(Order os){
        or.save(os);
   }

    public List<Order> getOrders() {
        return or.findAll();
    }

    public void deleteOrders(Order os1) {
        if (!or.existsById(os1.getOrderNum())) {
            throw new OrderNotFoundException("Order with ID " + os1.getOrderNum() + " not found");
        }
        or.deleteById(os1.getOrderNum());
    }

    public List<Order> getOrdersByCustomerName(String name) {
        return or.findByCustomerName(name);
    }

}

