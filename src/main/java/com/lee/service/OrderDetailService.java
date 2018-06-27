package com.lee.service;

import com.lee.dao.OrderDetailMapper;
import com.lee.dao.PurchaseOrderDao;
import com.lee.entity.OrderDetail;
import com.lee.entity.PurchaseOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService extends BaseService<OrderDetail,OrderDetailMapper> {
    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Override
    protected OrderDetailMapper getEntityDao() {
        return this.orderDetailMapper;
    }
}
