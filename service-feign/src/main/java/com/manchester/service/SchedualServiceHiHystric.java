package com.manchester.service;

import org.springframework.stereotype.Component;

/**
 * @Author:LiTongjing
 * @Description:
 * @Date:Create by 下午3:22 2018/3/6
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}