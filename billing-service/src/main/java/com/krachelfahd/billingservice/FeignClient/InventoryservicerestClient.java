package com.krachelfahd.billingservice.FeignClient;

import com.krachelfahd.billingservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "inventory-service")
public interface InventoryservicerestClient {
    @GetMapping("/products/{id}")
    Product getProduct(@PathVariable Long id);
    
}
