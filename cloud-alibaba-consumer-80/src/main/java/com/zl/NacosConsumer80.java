package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: NacosConsumer80
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/8 23:03
 * @Version: 1.0
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class NacosConsumer80 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumer80.class, args);
    }
}
