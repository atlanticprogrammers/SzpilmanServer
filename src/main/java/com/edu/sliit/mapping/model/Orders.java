package com.edu.sliit.mapping.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Orders", catalog = "Thogakade")
public class Orders {
    @Id
    @Column(name = "OrderId")
    private String orderId;

    @Column(name = "OrderDate")
    private Date orderDate;

    @OneToMany(
            mappedBy = "orders",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<OrderDetail> userGroups = new HashSet<OrderDetail>();

    public Orders() {}

    public Orders(String orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Set<OrderDetail> getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(Set<OrderDetail> userGroups) {
        this.userGroups = userGroups;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId='" + orderId + '\'' +
                ", orderDate=" + orderDate +
                ", userGroups=" + userGroups +
                '}';
    }
}
