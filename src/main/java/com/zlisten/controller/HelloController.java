package com.zlisten.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZListen on 17/7/28.
 */
@RestController
public class HelloController {

    @RequestMapping("hello")
    public String index(){
        System.out.print("hello Springboot");
        return "Hello SpringBoot";
    }
}
