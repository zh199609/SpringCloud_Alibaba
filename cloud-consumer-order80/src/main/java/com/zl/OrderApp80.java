package com.zl;

import com.rule.MyRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "loud-payment-service", configuration = MyRule.class)
public class OrderApp80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp80.class, args);
    }
}
