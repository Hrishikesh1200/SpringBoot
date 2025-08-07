package com.example.SpringWeb.controller;

import com.example.SpringWeb.model.Customer;
import com.example.SpringWeb.model.Product;
import com.example.SpringWeb.service.CustomerService;
import com.example.SpringWeb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//ResponseBody = when we need to return any value in server page like here we want
// "Hey, we are welcoming you:)" as output so responseBody will frame it in server page

//Controller + ResponseBody = RestController
//@Controller
@RestController
public class HomeController {

    @Autowired
    private ProductService pl;
    @Autowired
    private CustomerService cs;
 //   @ResponseBody
    @RequestMapping("/")
    public String Welcome(){
         return "Hey, We are welcoming you:)";
    }

    @RequestMapping("/about")
    public String About(){
        return "this is About Request";
    }

    @RequestMapping("/getList")
    public List<Product> getlist(){
        return pl.getProduct();
    }

    @PutMapping("/update")
    public Product UpdateValue(@RequestBody Product pr){
        return pl.UpdateValue(pr);
    }

    @PostMapping("/insert")
    public String insert(@RequestBody Product pr){
        pl.insertData(pr);
        return "Inserted";
    }

    @PostMapping("/insertCust")
    public String insertCust(@RequestBody Customer cs1){
        cs.insertData(cs1);
        return " Customer Inserted";
    }

    @GetMapping("/getCust")
    public List<Customer> getCust(){
        return cs.getCustDetail();
    }

    @DeleteMapping("/DeleteCust")
    public String deleteCust(@RequestBody Customer cs2){
        cs.DeleteCustomer(cs2);
        return "Customer Deleted Successfully";
    }
}
