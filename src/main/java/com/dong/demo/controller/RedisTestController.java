package com.dong.demo.controller;

import com.dong.demo.redis.RedisService;
import com.dong.demo.redis.TestKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName RedisTestController
 * @Description 测试将数据插入到redis数据库中
 * @Author
 * @Date 2019/1/11 15:58
 **/
@RestController
@RequestMapping("/test")
public class RedisTestController {

    @Autowired
    RedisService redisService;

    @GetMapping("/redis")
    public String test() {
        List<Integer> keyList = new ArrayList<>();
        for (int i=0;i<10;i++) {
            keyList.add(i);
        }

        boolean flag = redisService.set(TestKey.keyList, "", keyList);
        if (flag) {
            return "ok";
        }else {
            return "fail";
        }
    }

}
