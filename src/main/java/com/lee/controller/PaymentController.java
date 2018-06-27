package com.lee.controller;

import com.lee.entity.Payment;
import com.lee.entity.PurchaseOrder;
import com.lee.service.OrderDetailService;
import com.lee.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "payment")
public class PaymentController extends BaseController<Payment>{
    @Autowired
    private PaymentService paymentService;

    @Override
    protected PaymentService getService() {
        return this.paymentService;
    }
}
