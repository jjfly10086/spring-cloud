package com.eureka.server2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *@author jwh
 */
@EnableEurekaServer
@SpringBootApplication
public class StartEurekaServer2 {

    public static void main(String[] args){
        SpringApplication.run(StartEurekaServer2.class,args);
    }
}
