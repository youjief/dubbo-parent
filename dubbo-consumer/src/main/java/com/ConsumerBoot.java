package com;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ConsumerBoot
 * @Author 80320979
 * @Date 2021/7/8 18:10
 * @Description ConsumerBoot
 * @Version 1.0
 */
@EnableDubbo
@SpringBootApplication
public class ConsumerBoot {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerBoot.class, args);
    }
}
