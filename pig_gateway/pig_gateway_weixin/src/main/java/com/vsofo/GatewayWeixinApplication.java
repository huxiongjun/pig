package com.vsofo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/10 16:14
 * @description 微信网关访问需求
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayWeixinApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayWeixinApplication.class, args);
    }
}
