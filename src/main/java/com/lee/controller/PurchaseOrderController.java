package com.lee.controller;

import com.lee.entity.PurchaseOrder;
import com.lee.service.BaseService;
import com.lee.service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "order")
public class PurchaseOrderController extends BaseController<PurchaseOrder>{
    @Autowired
    private PurchaseOrderService purchaseOrderService;

    @Override
    protected PurchaseOrderService getService() {
        return this.purchaseOrderService;
    }
}
