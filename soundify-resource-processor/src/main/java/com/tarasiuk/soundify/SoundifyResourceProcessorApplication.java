package com.tarasiuk.soundify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SoundifyResourceProcessorApplication {
    public static void main(String[] args) {
        SpringApplication.run(SoundifyResourceProcessorApplication.class, args);
    }

}
