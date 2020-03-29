package com.zl.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: GatewayConfig
 * @Description: TODO
 * @Author: zl
 * @Date: 2020/3/29 22:22
 * @Version: 1.0
 **/
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_id", r -> r.path("/guonei")
                .uri("http://news.baidu.com")).build();
        return routes.build();
    }
}
