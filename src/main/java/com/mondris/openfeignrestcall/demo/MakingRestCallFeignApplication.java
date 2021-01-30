package com.mondris.openfeignrestcall.demo;

import feign.Contract;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class MakingRestCallFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(MakingRestCallFeignApplication.class, args);
    }



}
