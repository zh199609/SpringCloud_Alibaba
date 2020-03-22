package com.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRule {

    public IRule mySelfRule() {
//        随机
        return new RandomRule();
    }
}
