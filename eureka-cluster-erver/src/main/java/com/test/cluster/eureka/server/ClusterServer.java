package com.test.cluster.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClusterServer {
    public static void main(String ars[]){
        SpringApplication.run(ClusterServer.class,ars);
    }
}
