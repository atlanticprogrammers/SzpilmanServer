package com.edu.sliit.mapping.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OrderDetailId implements Serializable {
    private String itemCode;
    private String orderId;

    public OrderDetailId() {}

    public OrderDetailId(String orderId, String itemCode) {
        super();
        this.orderId = orderId;
        this.itemCode = itemCode;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDetailId)) return false;
        OrderDetailId that = (OrderDetailId) o;
        return orderId.equals(that.orderId) && itemCode.equals(that.itemCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, itemCode);
    }
}
