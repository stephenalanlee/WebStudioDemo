package com.lee.service;

import com.lee.dao.OrderDetailMapper;
import com.lee.dao.PaymentMapper;
import com.lee.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService extends BaseService<Payment,PaymentMapper> {
    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    protected PaymentMapper getEntityDao() {
        return this.paymentMapper;
    }
}
