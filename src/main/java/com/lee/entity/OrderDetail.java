package com.lee.entity;

import java.util.Date;

public class OrderDetail extends BaseEntity {
    private Integer id;

    private Integer orderId;

    private Integer materialId;

    private Double quantity;

    private Double deliverQuantity;

    private Double receiveQuantity;

    private Double price;

    private Date receiveDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getDeliverQuantity() {
        return deliverQuantity;
    }

    public void setDeliverQuantity(Double deliverQuantity) {
        this.deliverQuantity = deliverQuantity;
    }

    public Double getReceiveQuantity() {
        return receiveQuantity;
    }

    public void setReceiveQuantity(Double receiveQuantity) {
        this.receiveQuantity = receiveQuantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }
}