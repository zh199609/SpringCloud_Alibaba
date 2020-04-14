package com.zl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: SentinelController
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/14 21:32
 * @Version: 1.0
 **/
@RestController
public class SentinelController {

    @RequestMapping(value = "/echo")
    public String echo() throws InterruptedException {
        Thread.sleep(100);
        return "Hi Sentinel";
    }
}
