package com.emo.redis002springboot;

import com.emo.redis002springboot.pojo.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Redis002SpringbootApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void contextLoads() {

        // redisTemplate
        // opsForValue 操作字符串 String
        // opsForList 操作List
        //以此类推

        //常用的事务方法也提供了 discard exec等等
        //        redisTemplate.opsForValue()

        redisTemplate.opsForValue().set("mykey","hahaha");
        System.out.println(redisTemplate.opsForValue().get("mykey"));


        // 获取redis连接对象
        //RedisConnection connection = redisTemplate.getConnectionFactory().getConnection();
        //connection.flushDb();


    }

    @Test
    public void Test() throws JsonProcessingException {
        User user = new User("name", "age");
//        String writeValueAsString = new ObjectMapper().writeValueAsString(user);
//        redisTemplate.opsForValue().set("user",writeValueAsString);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

}
