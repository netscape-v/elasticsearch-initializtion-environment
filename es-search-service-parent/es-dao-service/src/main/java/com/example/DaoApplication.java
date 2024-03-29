package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.example.search.dao"})
public class DaoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DaoApplication.class,args);
    }
}
