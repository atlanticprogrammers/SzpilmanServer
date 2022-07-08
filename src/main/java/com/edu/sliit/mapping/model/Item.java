package com.edu.sliit.mapping.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Item", catalog = "Thogakade2")
public class Item {
    @Id
    @Column(name = "ItemCode")
    private String itemCode;

    @Column(name = "Description")
    private String description;

    @Column(name = "PackSize")
    private String packSize;

    @Column(name = "UnitPrice")
    private double unitPrice;

    @Column(name = "QtyOnHand")
    private int qtyOnHand;

    @OneToMany(
            mappedBy = "item",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private Set<OrderDetail> orderDetailSet = new HashSet<OrderDetail>();

    public Item() {}

    public Item(String itemCode, String description, String packSize, double unitPrice, int qtyOnHand) {
        this.itemCode = itemCode;
        this.description = description;
        this.packSize = packSize;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }

    public void setOrderDetailSet(Set<OrderDetail> orderDetailSet) {
        this.orderDetailSet = orderDetailSet;
    }

    public Set<OrderDetail> getOrderDetailSet() {
        return orderDetailSet;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemCode='" + itemCode + '\'' +
                ", description='" + description + '\'' +
                ", packSize='" + packSize + '\'' +
                ", unitPrice=" + unitPrice +
                ", qtyOnHand=" + qtyOnHand +
                ", orderDetailSet=" + orderDetailSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item item = (Item) o;
        return Double.compare(item.unitPrice, unitPrice) == 0 && qtyOnHand == item.qtyOnHand && Objects.equals(itemCode, item.itemCode) && Objects.equals(description, item.description) && Objects.equals(packSize, item.packSize) && Objects.equals(orderDetailSet, item.orderDetailSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemCode, description, packSize, unitPrice, qtyOnHand, orderDetailSet);
    }
}
