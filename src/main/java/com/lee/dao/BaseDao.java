package com.lee.dao;

import com.lee.entity.BaseEntity;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseDao<T extends BaseEntity> {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    private String getFullPath(String mappingId){
        return this.getClass().getName()+"."+mappingId;
    }

    public List<T> list(T param){
        return sqlSessionTemplate.selectList(getFullPath("selectList"),param);
    }
    public int deleteById(Integer id){
        return sqlSessionTemplate.delete(getFullPath("deleteByPrimaryKey"),id);
    }

    public int insert(T record){
        return sqlSessionTemplate.insert(getFullPath("insert"),record);
    }

    public int insertSelective(T record){
        return sqlSessionTemplate.insert(getFullPath("insertSelective"),record);
    }

    public T selectById(Integer id){
        return sqlSessionTemplate.selectOne(getFullPath("selectByPrimaryKey"),id);
    }

    public int updateByIdSelective(T record){
        return sqlSessionTemplate.update(getFullPath("updateByPrimaryKeySelective"),record);
    }

    public int updateById(T record){
        return sqlSessionTemplate.update(getFullPath("updateByPrimaryKey"),record);
    }
}
