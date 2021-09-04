package com.edu.sliit.mapping.controller;

import com.edu.sliit.mapping.model.*;
import com.edu.sliit.mapping.repository.ItemRepository;
import com.edu.sliit.mapping.repository.OrderDetailRepository;
import com.edu.sliit.mapping.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/thogakade/orderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private OrdersRepository ordersRepository;

    @GetMapping
    public List<OrderDetail> getAllOrders() {
        List<OrderDetail> all = orderDetailRepository.findAll();
        return orderDetailRepository.findAll();
    }

    @PostMapping("/{orderId}/{itemCode}")
    @ResponseStatus(HttpStatus.OK)
    public void placeOrder(@PathVariable String orderId, @PathVariable String itemCode) {
        Item item = itemRepository.findById(itemCode).get();
        Orders orders = ordersRepository.findById(orderId).get();
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setId(new OrderDetailId(orders.getOrderId(), item.getItemCode()));
        orderDetail.setOrders(orders);
        orderDetail.setItem(item);
        orderDetail.setOrderQTY(2);
        orderDetail.setDiscount(1);
        orderDetailRepository.save(orderDetail);
    }
}
