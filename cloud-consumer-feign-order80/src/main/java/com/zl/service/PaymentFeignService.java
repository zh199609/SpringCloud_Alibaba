package com.zl.service;

import com.zl.entity.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: PaymentFeignService
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/23 22:14
 * @Version: 1.0
 **/
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") Integer id);

    @RequestMapping(value = "payment/feign/timeout")
    String paymentFeignTimeout();
}
