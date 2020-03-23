package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName: OrderFeignApp80
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/23 22:03
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OrderFeignApp80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignApp80.class, args);
    }
}
