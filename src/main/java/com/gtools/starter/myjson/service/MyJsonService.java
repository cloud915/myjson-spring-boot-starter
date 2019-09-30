package com.gtools.starter.myjson.service;

import com.alibaba.fastjson.JSON;

/**
 * @Description
 * @Author ghy
 * @Date 2019/9/30 15:56
 */
public class MyJsonService {
    private String name;

    public String objToJson(Object object){
        return getName()+ JSON.toJSONString(object);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
