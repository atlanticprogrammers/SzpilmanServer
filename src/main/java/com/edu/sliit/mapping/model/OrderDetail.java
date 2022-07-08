package com.edu.sliit.mapping.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;

@Entity
@Table(name = "OrderDetail", catalog = "Thogakade2")
public class OrderDetail {

    @EmbeddedId
    private OrderDetailId id;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("orderId")
    @JsonIgnore
    private Orders orders;

    @ManyToOne(cascade = CascadeType.ALL)
    @MapsId("itemCode")
    @JsonIgnore
    private Item item;

    @Column(name = "OrderQTY")
    private int orderQTY;

    @Column(name = "Discount")
    private int discount;

    public OrderDetail() {}

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getOrderQTY() {
        return orderQTY;
    }

    public void setOrderQTY(int orderQTY) {
        this.orderQTY = orderQTY;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public OrderDetailId getId() {
        return id;
    }

    public void setId(OrderDetailId id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orders=" + orders +
                ", item=" + item +
                ", orderQTY=" + orderQTY +
                ", discount=" + discount +
                '}';
    }
}
