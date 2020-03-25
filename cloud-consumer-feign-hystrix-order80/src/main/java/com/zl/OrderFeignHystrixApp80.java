package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderFeignHystrixApp80
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/25 22:44
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OrderFeignHystrixApp80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignHystrixApp80.class, args);
    }
}
