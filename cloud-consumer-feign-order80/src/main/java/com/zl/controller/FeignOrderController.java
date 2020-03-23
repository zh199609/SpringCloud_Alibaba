package com.zl.controller;

import com.zl.entity.CommonResult;
import com.zl.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: FeignOrderController
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/23 22:19
 * @Version: 1.0
 **/
@RestController
@Slf4j
@RequestMapping(value = "consumer")
public class FeignOrderController {

    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Integer id) {
        return paymentFeignService.getPaymentById(id);
    }

    @RequestMapping(value = "/feign/timeout")
    public String paymentFeignTimeout() {
        //openfeign-ribbon 客户端一般默认3秒钟等待
        return paymentFeignService.paymentFeignTimeout();
    }
}
