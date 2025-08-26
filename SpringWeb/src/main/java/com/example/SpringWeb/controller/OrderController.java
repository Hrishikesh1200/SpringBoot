package com.example.SpringWeb.controller;

import com.example.SpringWeb.model.Order;
import com.example.SpringWeb.model.Product;
import com.example.SpringWeb.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
public class OrderController {
@Autowired
private OrderService oSer;

    //for taking order using post operation
    @PostMapping("/giveOrder")
    public String giveOrder(@RequestBody Order os){

        oSer.giveOrder(os);
        return "Order Taken Successfully";
    }

    //getting list of orders
    @GetMapping("/getOrders")
    public List<Order> getOrder(){
        return oSer.getOrders();
    }

    @DeleteMapping ("/DeleteOrders")
        public String deleteOrders(@RequestBody Order os1){
        oSer.deleteOrders(os1);
        return "Order Deleted Successfully";
    }

    @GetMapping("/orderbycustname/{name}")
    public List<Order> getOrdersByCustomer(@PathVariable String name) {
        return oSer.getOrdersByCustomerName(name);
    }
}
