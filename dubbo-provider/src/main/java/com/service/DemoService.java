package com.service;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * @ClassName DemoService
 * @Author 80320979
 * @Date 2021/7/8 18:17
 * @Description DemoService
 * @Version 1.0
 */

@Service
public interface DemoService {
    public String sayHello(String name);
}
