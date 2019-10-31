package com.test.microservice.account;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAutoConfiguration
        //(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient



public class AccountsServer {



    public static void main(String[] args) {
        // Will configure using accounts-server.yml
       // System.setProperty("spring.config.name", "accounts-server");

        SpringApplication.run(AccountsServer.class, args);
    }
}