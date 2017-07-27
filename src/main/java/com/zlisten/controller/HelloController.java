package com.zlisten.controller;

import com.zlisten.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZListen on 17/7/28.
 */
@RestController
public class HelloController {

    @Autowired
    private IRedisService redisService;

    @RequestMapping("helloSpringBoot")
    public String index(){
        System.out.print("hello Springboot");
        return "Hello SpringBoot";
    }


    @RequestMapping("/redis/set")
    public String redisSet(@RequestParam("value")String value){
        boolean isOk = redisService.set("name", value);
        return (isOk ? "200" : "500") + isOk + (isOk ? "success" : "error" );
    }

    @RequestMapping("/redis/get")
    public String redisGet(@RequestParam("name")String name){
        String value = redisService.get(name);
        return value;
    }
}
