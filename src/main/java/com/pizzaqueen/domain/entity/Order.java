package com.pizzaqueen.domain.entity;

import javax.persistence.*;
import java.sql.Time;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="orderid")
    private Integer orderId;
    @Column(name="order_products")
    private String orderProducts;
    @Column(name="order_timenow")
    private String orderTimeNow;
    @Column(name="order_timedelivery")
    private String orderTimeDelivery;
    @Column(name="order_address")
    private String orderAddress;
    @Column(name="order_date")
    private Date orderDate;
    @Column(name="order_delivery_cost")
    private double orderDeliveryCost;
    @Column(name="order_name")
    private String orderName;
    @Column(name="order_phone")
    private String orderPhone;
    @Column(name="order_final_price")
    private double orderPrice;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderProducts() {
        return orderProducts;
    }

    public void setOrderProducts(String orderProducts) {
        this.orderProducts = orderProducts;
    }

    public String getOrderTimeNow() {
        return orderTimeNow;
    }

    public void setOrderTimeNow(String orderTimeNow) {
        this.orderTimeNow = orderTimeNow;
    }

    public String getOrderTimeDelivery() {
        return orderTimeDelivery;
    }

    public void setOrderTimeDelivery(String orderTimeDelivery) {
        this.orderTimeDelivery = orderTimeDelivery;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getOrderDeliveryCost() {
        return orderDeliveryCost;
    }

    public void setOrderDeliveryCost(double orderDeliveryCost) {
        this.orderDeliveryCost = orderDeliveryCost;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderPhone() {
        return orderPhone;
    }

    public void setOrderPhone(String orderPhone) {
        this.orderPhone = orderPhone;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", products=" + orderProducts +
                ", orderTimeNow=" + orderTimeNow +
                ", orderTimeDelivery=" + orderTimeDelivery +
                ", orderAddress='" + orderAddress + '\'' +
                ", orderDate=" + orderDate +
                ", orderDeliveryCost=" + orderDeliveryCost +
                ", orderName='" + orderName + '\'' +
                ", orderPhone='" + orderPhone + '\'' +
                ", orderPrice=" + orderPrice +
                '}';
    }

}
