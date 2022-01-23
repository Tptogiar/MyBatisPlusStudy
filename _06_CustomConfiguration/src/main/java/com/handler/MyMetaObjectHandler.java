package com.handler;

import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/23 - 19:48
 */
public class MyMetaObjectHandler extends MetaObjectHandler {


    public void insertFill(MetaObject metaObject) {
        Object lastName = getFieldValByName("lastName", metaObject);
        if (lastName==null){
            System.out.printf("----------insert____________");
            setFieldValByName("lastName","insert fill",metaObject);
        }
    }

    public void updateFill(MetaObject metaObject) {
        Object fieldValue = getFieldValByName("lastName", metaObject);
        if(fieldValue == null) {
            System.out.printf("----------update____________");
            setFieldValByName("lastName", "update fill", metaObject);
        }
    }
}
