package com.edu.sliit.mapping.model;

import javax.persistence.*;

@Entity
@Table(name = "OrderDetail", catalog = "Thogakade")
public class OrderDetail {
    @Id
    @Column(name = "TestId")
    private String testId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "OrderID")
    private Orders orders;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ItemCode")
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

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
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
