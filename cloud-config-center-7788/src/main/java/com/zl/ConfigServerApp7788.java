package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName: ConfigServerApp7788
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/1 22:50
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigServerApp7788 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApp7788.class, args);
    }
}
