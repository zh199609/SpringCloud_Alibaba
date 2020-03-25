package com.zl.controller;

import com.netflix.discovery.converters.Auto;
import com.zl.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: PaymentController
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/25 22:13
 * @Version: 1.0
 **/
@RestController
@Slf4j
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("hystrix/ok/{id}")
    public String paymentInfo_ok(@PathVariable("id") Integer id) {
        String s = paymentService.paymentInfo_ok(id);
        log.info("-------:" + s);
        return s;
    }

    @RequestMapping("hystrix/timeout/{id}")
    public String paymentInfo_timeout(@PathVariable("id") Integer id) {
        String s = paymentService.paymentInfo_Timeout(id);
        log.info("-------:" + s);
        return s;
    }

}
