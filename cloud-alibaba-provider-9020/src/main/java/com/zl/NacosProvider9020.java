package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: NacosProvider9020
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/8 22:52
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProvider9020 {
    public static void main(String[] args) {
        SpringApplication.run(NacosProvider9020.class, args);
    }
}
