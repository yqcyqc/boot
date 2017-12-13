package com.didispace;

import com.didispace.domain.RedisUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by zhudonghong123 on 2017/12/13.
 * RedisTemplate实例编写测试用例实验效果
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTests2 {
    @Autowired
    private RedisTemplate<String, RedisUser> redisTemplate;

    @Test
    public void test() throws Exception {

        // 保存对象
        RedisUser user = new RedisUser("超人", 20);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        user = new RedisUser("蝙蝠侠", 30);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        user = new RedisUser("蜘蛛侠", 40);
        redisTemplate.opsForValue().set(user.getUsername(), user);

        Assert.assertEquals(20, redisTemplate.opsForValue().get("超人").getAge().longValue());
        Assert.assertEquals(30, redisTemplate.opsForValue().get("蝙蝠侠").getAge().longValue());
        Assert.assertEquals(40, redisTemplate.opsForValue().get("蜘蛛侠").getAge().longValue());

    }

}
