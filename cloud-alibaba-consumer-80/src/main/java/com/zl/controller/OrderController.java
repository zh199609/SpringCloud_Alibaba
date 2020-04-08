package com.zl.controller;

import com.zl.entity.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: OrderController
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/4/8 23:08
 * @Version: 1.0
 **/
@RestController
public class OrderController {

    @Value("${service-url.nacos-user-service}")
    private String serviceUrl;

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "echo}")
    public CommonResult getPayment() {
        String commonResult = restTemplate.getForObject(serviceUrl + "/echo", String.class);
        return CommonResult.success(commonResult);
    }
}
