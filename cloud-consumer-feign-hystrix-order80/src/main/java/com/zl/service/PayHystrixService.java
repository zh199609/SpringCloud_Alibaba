package com.zl.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: PayHystrixService
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/25 22:48
 * @Version: 1.0
 **/
@Component
@FeignClient(value = "cloud-payment-hystrix-service")
public interface PayHystrixService {
    @RequestMapping("/payment/hystrix/ok/{id}")
    String paymentInfo_ok(@PathVariable("id") Integer id);

    @RequestMapping("payment/hystrix/timeout/{id}")
    String paymentInfo_timeout(@PathVariable("id") Integer id);

}
