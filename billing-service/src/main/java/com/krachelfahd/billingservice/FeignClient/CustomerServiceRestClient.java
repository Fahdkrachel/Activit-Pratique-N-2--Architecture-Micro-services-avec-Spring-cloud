package com.krachelfahd.billingservice.FeignClient;

import com.krachelfahd.billingservice.model.Customer;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer-service")
@CircuitBreaker(name="cutomer-service",fallbackMethod = "getDefaultCustomer")
public interface CustomerServiceRestClient {
    @GetMapping("/customers/{id}")
    Customer findCustomerById(@PathVariable Long id);

    default Customer getDefaultCustomer(String id, Exception exception) {
        // pour afficher aux adminidtrateur exeception
        exception.printStackTrace();
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName("default customer name");
        customer.setEmail("default@gmail.com");
        return customer;
    }
}
