package com.didispace.service;

/**
 * Created by zhudonghong123 on 2017/12/12.
 */
public interface UserService {

    /**
     * 新增一个用户
     *
     * @param name
     * @param age
     */
    void create(String name, Integer age);

    /**
     * 根据名字删除一个用户
     *
     * @param name
     */
    void deleteByNamr(String name);

    /**
     * 获取用户总数
     *
     * @return
     */
    Integer getAllUers();

    /**
     * 删除所有用户
     */
    void deleteAllUser();
}
