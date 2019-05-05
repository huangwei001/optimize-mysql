package com.test;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"com.test"})
@EnableScheduling
@MapperScan("com.test.mapper")
public class OptimizeApplication {
    public static void main(String[] args) {
        SpringApplication.run(OptimizeApplication.class, args);
    }
}
