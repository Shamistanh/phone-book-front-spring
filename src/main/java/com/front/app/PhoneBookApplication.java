package com.front.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PhoneBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoneBookApplication.class, args);
    }

}
