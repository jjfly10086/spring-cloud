package com.service.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jwh
 */
@EnableDiscoveryClient
@SpringBootApplication
public class StartServiceProvider {
    public static void main(String[] args){
        SpringApplication.run(StartServiceProvider.class,args);
    }
}
