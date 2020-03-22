package com.zl.controller;

import com.zl.entity.CommonResult;
import com.zl.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

//    private static final String payment_URL = "http://127.0.0.1:8001";
    private static final String payment_URL = "http://CLOUD-PAYMENT-SERVICE";

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        CommonResult commonResult = restTemplate.postForObject(payment_URL + "/payment/create", payment, CommonResult.class);
        return commonResult;
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult get(@PathVariable("id") Integer id) {
        CommonResult commonResult = restTemplate.getForObject(payment_URL + "/payment/get/" + id, CommonResult.class);
        return commonResult;
    }
}
