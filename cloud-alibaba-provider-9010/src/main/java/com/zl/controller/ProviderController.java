package com.zl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ProviderController
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/8 22:24
 * @Version: 1.0
 **/
@RestController
public class ProviderController {
    @RequestMapping(value = "/echo")
    public String echo() {
        return "hi Nacos:9010";
    }
}
