package com;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ProviderBoot
 * @Author 80320979
 * @Date 2021/7/8 18:10
 * @Description ProviderBoot
 * @Version 1.0
 */
@EnableDubbo
@SpringBootApplication
public class ProviderBoot {
    public static void main(String[] args) {
        SpringApplication.run(ProviderBoot.class, args);
    }
}
