package com.vsofo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/8 10:03
 * @description Eureka 服务启动类
 */
@SpringBootApplication
@EnableEurekaServer
class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
