package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: HystrixPaymentApp8001
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/25 22:04
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
//激活hystrix
@EnableCircuitBreaker
public class HystrixPaymentApp8001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixPaymentApp8001.class, args);
    }
}
