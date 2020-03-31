package com.zl.config;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName: GatewayFilter
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/31 22:02
 * @Version: 1.0
 **/
@Component
public class GatewayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("*******************start filter");
        MultiValueMap<String, String> queryParams = exchange.getRequest().getQueryParams();
        System.out.println("queryParams:" + queryParams);
        if (1 == 2) {
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
