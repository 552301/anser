package com.jimy.anser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AnserGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnserGatewayApplication.class, args);
    }

}
