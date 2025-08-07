package com.example.SpringWeb.service;

import com.example.SpringWeb.Repository.ProductRepo;
import com.example.SpringWeb.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo PR;
//    List<Product> Products = Arrays.asList(new Product("SAMSUNG",11,22222),
//            new Product("ddd",233,334));

    public List<Product> getProduct(){
        return PR.findAll();
    }

    public void insertData(Product pr1){
       PR.save(pr1);
    }

    public Product UpdateValue(Product pr2) {
        PR.save(pr2);
        return PR.findById(pr2.getProdID()).orElse(null);
    }
}
