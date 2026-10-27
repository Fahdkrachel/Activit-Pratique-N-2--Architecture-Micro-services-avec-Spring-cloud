package com.krachelfahd.billingservice.entities;

import com.krachelfahd.billingservice.model.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bill {
    @Id
    @GeneratedValue
    private Long id;
    private Date billingDate;
    // ce attribut pour  representer la lisain entre les microservicies
    private long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems;

    /* ona utiliser objet Customer du classe package model pour representer  DI
     et Transient pour ne pas enregistrer ce attribut dans base de donnes de ce microsservices */

    @Transient
    private Customer customer;
}
