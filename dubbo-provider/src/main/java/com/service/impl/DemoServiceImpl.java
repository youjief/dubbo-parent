package com.service.impl;

import com.service.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoServiceImpl
 * @Author 80320979
 * @Date 2021/7/8 18:17
 * @Description DemoServiceImpl
 * @Version 1.0
 */

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }

}
