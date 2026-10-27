package com.krachelfahd.billingservice.web;

import com.krachelfahd.billingservice.FeignClient.CustomerServiceRestClient;
import com.krachelfahd.billingservice.FeignClient.InventoryservicerestClient;
import com.krachelfahd.billingservice.entities.Bill;
import com.krachelfahd.billingservice.repositories.BillRepository;
import com.krachelfahd.billingservice.repositories.ProductItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BillRestController<ProductRestClient> {
    @Autowired
    private BillRepository billRepository;
    @Autowired
    private ProductItemRepository productItemRepository;
    @Autowired
    private CustomerServiceRestClient customerRestClient;
    @Autowired
    private InventoryservicerestClient productRestClient;
    @GetMapping(path = "/bills/{id}")
    public Bill getBill(@PathVariable Long id){
        Bill bill = billRepository.findById(id).get();
        bill.setCustomer(customerRestClient.findCustomerById(bill.getCustomerId()));
        bill.getProductItems().forEach(productItem -> {
            productItem.setProduct(productRestClient.getProduct(productItem.getProductId()));
        });
        return bill;
    }
}
