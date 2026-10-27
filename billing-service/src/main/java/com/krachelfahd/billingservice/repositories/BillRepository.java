package com.krachelfahd.billingservice.repositories;

import com.krachelfahd.billingservice.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Long> {
}
