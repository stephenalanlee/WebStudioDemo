package com.lee.controller;

import com.github.pagehelper.PageInfo;
import com.lee.dao.BaseDao;
import com.lee.entity.BaseEntity;
import com.lee.service.BaseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public abstract class BaseController <T extends BaseEntity>{
    protected abstract <E extends BaseService<T,?>> E getService();
    @RequestMapping(value = "pagedList",method = RequestMethod.GET)
    public PageInfo<T> pagedList(T param){
        return new PageInfo<T>(getService().getPageData(param));
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<T> list(T param){
        return getService().list(param);
    }

    @RequestMapping(value = "deleteById",method = RequestMethod.DELETE)
    public int deleteById(Integer id){
        return getService().deleteById(id);
    }

    @RequestMapping(value = "create",method = RequestMethod.POST)
    public int insert(T record){
        return getService().insert(record);
    }
    @RequestMapping(value = "createSelective",method = RequestMethod.POST)
    public int insertSelective(T record){
        return getService().insertSelective(record);
    }
    @RequestMapping(value = "getById",method = RequestMethod.GET)
    public T selectById(Integer id){
        return getService().selectById(id);
    }
    @RequestMapping(value = "modifyByIdSelective",method = RequestMethod.PUT)
    public int updateByIdSelective(T record){
        return getService().updateByIdSelective(record);
    }
    @RequestMapping(value = "modifyById",method = RequestMethod.PUT)
    public int updateById(T record){
        return getService().updateById(record);
    }
}
