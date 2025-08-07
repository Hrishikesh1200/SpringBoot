package com.example.SpringWeb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    private int id;
    private String name;
    private String address;

    @OneToOne
    @JoinColumn(name = "prod_id", referencedColumnName = "ProdID", nullable = false, unique = true)
    private Product pr;


}
