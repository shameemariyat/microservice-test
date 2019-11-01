package com.test.eureka.cluster.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClusterClient {

    public static void main(String ars[]){
        SpringApplication.run(ClusterClient.class,ars);
    }
}
