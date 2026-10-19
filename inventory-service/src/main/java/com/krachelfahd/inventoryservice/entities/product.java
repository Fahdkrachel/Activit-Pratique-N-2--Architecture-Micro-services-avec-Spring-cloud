package com.krachelfahd.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class product {
    @Id @GeneratedValue

    private Long id;
    private String name;
    private double price;
    private int quantity;
}
