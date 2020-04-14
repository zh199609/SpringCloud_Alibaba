package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: SentinelServiceApp3366
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/14 21:31
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceApp3366 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceApp3366.class, args);
    }
}
