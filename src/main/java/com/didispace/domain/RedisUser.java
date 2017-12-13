package com.didispace.domain;

import java.io.Serializable;

/**
 * Created by zhudonghong123 on 2017/12/13.
 */
public class RedisUser implements Serializable {

    private static final long serialVersionUID = -1L;

    private String username;
    private Integer age;

    public RedisUser(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
