package com.zl.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigClientController
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/1 23:10
 * @Version: 1.0
 **/
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config}")
    private String config;

    @RequestMapping("getServerConfig")
    public String getServerConfig() {
        return config;
    }
}
