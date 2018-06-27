package com.lee.controller;

import com.lee.entity.PurchaseOrder;
import com.lee.service.BaseService;
import com.lee.service.OrderDetailService;
import com.lee.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "detail")
public class OrderDetailController extends BaseController<PurchaseOrder>{
    @Autowired
    private OrderDetailService orderDetailService;

    @Override
    protected OrderDetailService getService() {
        return this.orderDetailService;
    }
}
