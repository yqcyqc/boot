package com.didispace;

import com.didispace.domain.MyUser;
import com.didispace.mapper.MyUserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhudonghong123 on 2017/12/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyUserTests {

    @Autowired
    private MyUserMapper myUserMapper;

    @Test
    @Rollback
    public void findByName() throws Exception {
        myUserMapper.insert("AAA", 20);
        MyUser u = myUserMapper.findByName("AAA");
        Assert.assertEquals(20, u.getAge().intValue());
    }

}

