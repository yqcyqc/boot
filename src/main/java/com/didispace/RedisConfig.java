package com.didispace;

import com.didispace.domain.RedisObjectSerializer;
import com.didispace.domain.RedisUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * Created by zhudonghong123 on 2017/12/13.
 * 配置针对User的RedisTemplate实例
 */

@Configuration
public class RedisConfig {
    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        return new JedisConnectionFactory();
    }

    @Bean
    public RedisTemplate<String, RedisUser> redisTemplate(RedisConnectionFactory jedisConnectionFactory) {
        RedisTemplate<String, RedisUser> template = new RedisTemplate<String, RedisUser>();
        template.setConnectionFactory(jedisConnectionFactory());
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new RedisObjectSerializer());
        return template;
    }

}
