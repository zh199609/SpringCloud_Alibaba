package com.zl.controller;

import com.zl.entity.CommonResult;
import com.zl.entity.Payment;
import com.zl.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("payment")
@Slf4j
public class PaymentController {


    @Autowired
    private PaymentService paymentService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("create")
    public CommonResult save(@RequestBody Payment payment) {
        log.info("*****8002插入数据：", payment);
        paymentService.save(payment);
        return new CommonResult(200, "8002");
    }

    @GetMapping("get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Integer id) {
        Payment byId = paymentService.getById(id);
        if (byId != null) {
            CommonResult success = CommonResult.success(byId);
            success.setMessage("8002");
            return success;
        }
        return CommonResult.error();
    }

    @RequestMapping("discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("***service:" + service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for (ServiceInstance instance : instances) {
            log.info("***instance:" + instance);
        }
        return discoveryClient;
    }

    @RequestMapping(value = "/feign/timeout")
    public String paymentFeignTimeout(){
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "paymentFeignTimeout";
    }
}
