package com.zl.controller;

import com.zl.service.PayHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HysrixController
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/25 22:51
 * @Version: 1.0
 **/
@RestController
@Slf4j
@RequestMapping(value = "consumer")
public class HysrixController {

    @Autowired
    private PayHystrixService payHystrixService;

    @RequestMapping("hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id) {
        String s = payHystrixService.paymentInfo_ok(id);
        log.info("-------:" + s);
        return s;
    }

    @RequestMapping("hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id) {
        String s = payHystrixService.paymentInfo_timeout(id);
        log.info("-------:" + s);
        return s;
    }
}
