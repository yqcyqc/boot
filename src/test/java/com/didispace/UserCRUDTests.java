package com.didispace;

import com.didispace.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhudonghong123 on 2017/12/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserCRUDTests {
    @Autowired
    private UserService userSerivce;



    @Test
    public void test() throws Exception {
        // 插入5个用户
        userSerivce.create("a", 1);
        userSerivce.create("b", 2);
        userSerivce.create("c", 3);
        userSerivce.create("d", 4);
        userSerivce.create("e", 5);


    }

    @Test
    public void test1() throws Exception {
        // 查数据库，应该有5个用户
        Assert.assertEquals(5, userSerivce.getAllUers().intValue());
    }

    @Test
    public void test2() throws Exception {
        // 删除两个用户
        userSerivce.deleteByNamr("a");
        userSerivce.deleteByNamr("e");
    }

    @Test
    public void test3() throws Exception {
        // 查数据库，应该有5个用户
        Assert.assertEquals(3, userSerivce.getAllUers().intValue());
    }


}
