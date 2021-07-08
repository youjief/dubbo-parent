package com.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @ClassName DemoTest
 * @Author 80320979
 * @Date 2021/7/8 18:21
 * @Description DemoTest
 * @Version 1.0
 */
@Component
public class DemoTest {
    @Reference
    private DemoService demoService;

    public void print(){
        System.out.println(demoService);
        demoService.sayHello("world");
    }
}
