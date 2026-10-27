package com.krachelfahd.billingservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.krachelfahd.billingservice.model.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder
public class ProductItem {
    @Id
    @GeneratedValue
    private Long id;
    private long productId;
    private int quantity;
    private double price;
    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Bill bill;

    @Transient
    private Product product;

}
