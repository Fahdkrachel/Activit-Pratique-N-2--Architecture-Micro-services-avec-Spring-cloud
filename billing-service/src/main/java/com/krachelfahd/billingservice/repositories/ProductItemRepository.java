package com.krachelfahd.billingservice.repositories;

import com.krachelfahd.billingservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
    List<ProductItem> findByBillId(Long billId);
}
