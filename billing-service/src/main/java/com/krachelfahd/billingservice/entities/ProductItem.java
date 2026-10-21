package com.krachelfahd.billingservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ProductItem {
    @Id
    @GeneratedValue
    private Long id;
    private long productId;
    private int quantity;
    private double price;
    @ManyToOne
    private Bill bill;

}
