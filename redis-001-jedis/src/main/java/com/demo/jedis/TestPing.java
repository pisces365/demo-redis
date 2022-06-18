package com.demo.jedis;

import redis.clients.jedis.Jedis;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: 杨捷宁
 * @Date: 2022/02/11/15:31
 * @Description:
 */
public class TestPing {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1",6379);
//        Jedis jedis = new Jedis("112.124.35.32",6379);
        System.out.println(jedis.ping());
    }

}
