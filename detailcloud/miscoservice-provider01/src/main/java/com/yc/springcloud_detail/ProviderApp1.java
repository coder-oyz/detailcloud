package com.yc.springcloud_detail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //启动服务器发现客户端，以获取当前provider的注册信息
public class ProviderApp1 {

    public static void main(String[] args) {

        SpringApplication.run(ProviderApp1.class, args);
    }

}
