package com.zl.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
@DefaultProperties(defaultFallback = "global_fallbackMethod")
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
  /*  public String paymentInfo_timeout(@PathVariable("id") Integer id) {
        String s = payHystrixService.paymentInfo_timeout(id);
        log.info("-------:" + s);
        return s;
    }*/
    /*@HystrixCommand(fallbackMethod = "paymentTimeOutFallBackMethod", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    })*/
    @HystrixCommand//使用全局降级
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        int i = 10 / 0;
        return payHystrixService.paymentInfo_timeout(id);
    }

    public String paymentTimeOutFallBackMethod(@PathVariable("id") Integer id) {
        return "我是消费者80，对方支付系统繁忙，请稍后再试，o(╥﹏╥)o";
    }

    public String global_fallbackMethod() {
        return "Global异常处理信息，请稍后再试!。。。";
    }
}
