package com.edu.sliit.mapping.repository;

import com.edu.sliit.mapping.model.OrderDetail;
import com.edu.sliit.mapping.model.OrderDetailId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, OrderDetailId> {
}
