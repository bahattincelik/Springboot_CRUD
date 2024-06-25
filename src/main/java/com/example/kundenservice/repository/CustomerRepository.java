package com.example.kundenservice.repository;

import com.example.kundenservice.entity.Customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
