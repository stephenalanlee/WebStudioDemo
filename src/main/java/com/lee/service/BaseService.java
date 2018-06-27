package com.lee.service;

import com.github.pagehelper.PageHelper;
import com.lee.dao.BaseDao;
import com.lee.entity.BaseEntity;
import com.lee.entity.PurchaseOrder;

import java.util.List;

public abstract class BaseService<T extends BaseEntity,E extends BaseDao<T>> {
    protected abstract E getEntityDao();

    public List<T> getPageData(T param){
        PageHelper.startPage(param.getPageIndex(), param.getLimit());
        return getEntityDao().list(param);
    }
    public List<T> list(T param){
        return getEntityDao().list(param);
    }
    public int deleteById(Integer id){
        return getEntityDao().deleteById(id);
    }

    public int insert(T record){
        return getEntityDao().insert(record);
    }

    public int insertSelective(T record){
        return getEntityDao().insertSelective(record);
    }

    public T selectById(Integer record){
        return getEntityDao().selectById(record);
    }

    public int updateByIdSelective(T record){
        return getEntityDao().updateByIdSelective(record);
    }

    public int updateById(T record){
        return getEntityDao().updateById(record);
    }
}
