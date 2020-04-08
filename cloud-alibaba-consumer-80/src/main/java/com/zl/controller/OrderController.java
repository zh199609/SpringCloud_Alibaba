package com.zl.controller;

import com.zl.entity.CommonResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


    @RequestMapping(value = "get/{id}")
    public CommonResult getPayment(@PathVariable("id") int id) {

        return CommonResult.success("");
    }
}
