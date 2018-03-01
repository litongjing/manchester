package com.manchester.controller;

import com.manchester.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:LiTongjing
 * @Description:
 * @Date:Create by 下午2:28 2018/3/1
 */
@RestController
public class HelloController {


    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

    @RequestMapping(value = "/ok")
    public String hi() {
        return "ok";
    }
}
