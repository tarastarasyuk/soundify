package com.tarasiuk.soundify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SoundifySongServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SoundifySongServiceApplication.class, args);
    }
}
