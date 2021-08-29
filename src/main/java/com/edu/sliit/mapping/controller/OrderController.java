package com.edu.sliit.mapping.controller;

import com.edu.sliit.mapping.model.Customer;
import com.edu.sliit.mapping.model.Orders;
import com.edu.sliit.mapping.repository.CustomerRepository;
import com.edu.sliit.mapping.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/thogakade/order")
public class OrderController {
    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    @PostMapping("/{customerId}")
    @ResponseStatus(HttpStatus.OK)
    public void placeOrder(@RequestBody Orders orders, @PathVariable String customerId) {
        Customer customer = customerRepository.findById(customerId).get();
        customer.getOrders().add(orders);
        customerRepository.save(customer);
    }

    @DeleteMapping("cancel/{orderId}")
    public void deleteOrder(@PathVariable String orderId) {
        ordersRepository.deleteById(orderId);
    }
}
