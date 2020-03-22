package com.zl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: APp
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/18 22:16
 * @Version: 1.0
 **/
@SpringBootApplication
@MapperScan("com.zl.mapper")
@EnableEurekaClient
@EnableDiscoveryClient
public class PaymentApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentApp8001.class, args);
    }

}
