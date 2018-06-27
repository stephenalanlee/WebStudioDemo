package com.lee.entity;

import java.util.Date;

public class Payment extends BaseEntity {
    private Integer id;

    private Integer targetId;

    private Integer batch;

    private Double discountRate;

    private Double amount;

    private Double paymentCut;

    private String cutReason;

    private Integer category;

    private Double paidRate;

    private Date createDate;

    private Integer creator;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTargetId() {
        return targetId;
    }

    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    public Integer getBatch() {
        return batch;
    }

    public void setBatch(Integer batch) {
        this.batch = batch;
    }

    public Double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getPaymentCut() {
        return paymentCut;
    }

    public void setPaymentCut(Double paymentCut) {
        this.paymentCut = paymentCut;
    }

    public String getCutReason() {
        return cutReason;
    }

    public void setCutReason(String cutReason) {
        this.cutReason = cutReason == null ? null : cutReason.trim();
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Double getPaidRate() {
        return paidRate;
    }

    public void setPaidRate(Double paidRate) {
        this.paidRate = paidRate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }
}