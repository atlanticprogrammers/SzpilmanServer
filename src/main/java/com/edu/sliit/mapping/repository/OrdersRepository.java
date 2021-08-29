package com.edu.sliit.mapping.repository;

import com.edu.sliit.mapping.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders,String> {

}
