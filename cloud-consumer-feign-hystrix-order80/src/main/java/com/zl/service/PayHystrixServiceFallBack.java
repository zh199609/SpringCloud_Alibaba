package com.zl.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName: PayHystrixServiceFallBack
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/29 14:37
 * @Version: 1.0
 **/
@Component
public class PayHystrixServiceFallBack implements PayHystrixService  {
    @Override
    public String paymentInfo_ok(Integer id) {
        return "PayHystrixServiceFallBack------paymentInfo_ok-";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "PayHystrixServiceFallBack--------paymentInfo_timeout";
    }
}
