package com.didispace;

import com.didispace.domain.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhudonghong123 on 2017/12/13.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogPropertiesTests {
    @Autowired
    private BlogProperties blogProperties;


    @Test
    public void getHello() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "程序猿DD");
        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot教程");
    }


}
