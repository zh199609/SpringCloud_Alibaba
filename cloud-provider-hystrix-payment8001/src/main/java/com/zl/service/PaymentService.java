package com.zl.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName: PaymentService
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/25 22:07
 * @Version: 1.0
 **/
@Service
public class PaymentService {

    public String paymentInfo_ok(Integer id) {

        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_ok:" + id + "嘿嘿";
    }


    /**
     * @return java.lang.String
     * @Author i-leizh
     * @Description 一旦调用服务方法失败并抛出了错误信息后，
     * * 会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
     * @Date 2020/3/25 23:08
     * @Param [id]
     **/
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutFallBack", commandProperties = {
//            /设置这个线程的超时时间是3s，3s内是正常的业务逻辑，超过3s调用fallbackMethod指定的方法进行处理
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfo_Timeout(Integer id) {
        int timeout = 1;
        int i = 10 / 0;
        try {
            TimeUnit.SECONDS.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_Timeout:" + id + "超时" + timeout;
    }

    public String paymentInfo_TimeoutFallBack(Integer id) {
        return "线程池：" + Thread.currentThread().getName() + "paymentInfo_TimeoutFallBack:" + id + "服务降级";
    }
}
