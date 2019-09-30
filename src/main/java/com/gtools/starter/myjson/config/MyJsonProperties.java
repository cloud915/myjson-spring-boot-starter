package com.gtools.starter.myjson.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Description
 * @Author ghy
 * @Date 2019/9/30 15:57
 */
@ConfigurationProperties(prefix = "gtools.json")
public class MyJsonProperties {
    public static final String DEFAULT_NAME = "myjson";
    private String name = DEFAULT_NAME;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
