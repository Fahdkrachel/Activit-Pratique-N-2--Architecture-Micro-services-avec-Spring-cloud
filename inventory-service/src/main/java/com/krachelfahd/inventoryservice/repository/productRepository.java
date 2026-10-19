package com.krachelfahd.inventoryservice.repository;

import com.krachelfahd.inventoryservice.entities.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface productRepository extends JpaRepository<product,Long> {

}
