package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: GatewayApp9001
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/29 21:53
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
public class GatewayApp9001 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApp9001.class);
    }
}
