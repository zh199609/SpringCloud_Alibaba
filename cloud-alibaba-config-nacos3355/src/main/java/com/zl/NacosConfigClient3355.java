package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: NacosConfigClient3355
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/12 19:29
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClient3355 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigClient3355.class, args);
    }
}
