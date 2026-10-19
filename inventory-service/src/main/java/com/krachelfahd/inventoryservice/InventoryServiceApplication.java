package com.krachelfahd.inventoryservice;

import com.krachelfahd.inventoryservice.entities.product;
import com.krachelfahd.inventoryservice.repository.productRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(productRepository productRepository) {
        return args -> {
            productRepository.save(product.builder()
                    .name("Computer")
                    .price(34000)
                    .quantity(12)
                    .build());
            productRepository.save(product.builder()
                    .name("Printer")
                    .price(1200)
                    .quantity(11)
                    .build());
            productRepository.save(product.builder()
                    .name("smartphone")
                    .price(1300)
                    .quantity(10)
                    .build());
        };
    }

}
