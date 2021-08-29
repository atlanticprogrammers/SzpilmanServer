package com.edu.sliit.mapping.repository;

import com.edu.sliit.mapping.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {

}
