package com.example.SpringWeb.service;


import com.example.SpringWeb.Repository.CustomerRepo;
import com.example.SpringWeb.Repository.ProductRepo;
import com.example.SpringWeb.model.Customer;
import com.example.SpringWeb.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

@Autowired
CustomerRepo cr;

    public void insertData(Customer cs2) {
        cr.save(cs2);
    }

    public List<Customer> getCustDetail() {
        return cr.findAll();
    }


    public void DeleteCustomer(Customer cs2) {
       cr.deleteById(cs2.getId());
    }
}
