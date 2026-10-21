package com.krachelfahd.billingservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bill {
    @Id
    @GeneratedValue
    private Long id;
    private Date billingDate;
    // ce attribut pour representer dependence entre cusomer et billing service
    private long customerId;
    @OneToMany(mappedBy = "bill")
    private List<ProductItem> productItems;
}
