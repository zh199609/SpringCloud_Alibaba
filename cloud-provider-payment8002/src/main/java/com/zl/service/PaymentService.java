package com.zl.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zl.entity.Payment;
import com.zl.mapper.PaymentMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @ClassName: PaymentService
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/18 22:29
 * @Version: 1.0
 **/
@Service
@Slf4j
public class PaymentService extends ServiceImpl<PaymentMapper, Payment> {

}
