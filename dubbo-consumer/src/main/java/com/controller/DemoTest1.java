package com.controller;

import com.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @ClassName DemoTest
 * @Author 80320979
 * @Date 2021/7/8 18:21
 * @Description DemoTest
 * @Version 1.0
 */
@Api(tags = "Test")
@RestController
@RequestMapping(value = "/test1")
public class DemoTest1 {
    @Reference
    private DemoService demoService;

    @ApiOperation(value = "qqqq1")
    @GetMapping(value = "/abc")
    public String print(){
        System.out.println(demoService);
      return  demoService.sayHello("world"+ LocalDateTime.now());
    }
}
