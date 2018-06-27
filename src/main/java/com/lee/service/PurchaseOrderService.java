package com.lee.service;

import com.lee.dao.PurchaseOrderDao;
import com.lee.entity.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService extends BaseService<PurchaseOrder,PurchaseOrderDao> {
    @Autowired
    private PurchaseOrderDao purchaseOrderDao;

    @Override
    protected PurchaseOrderDao getEntityDao() {
        return this.purchaseOrderDao;
    }
}
