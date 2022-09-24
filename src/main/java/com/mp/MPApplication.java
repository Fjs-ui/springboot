package com.mp;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mp.mapper")
public class MPApplication {
    public static void main(String[] args) {
        SpringApplication.run(MPApplication.class,args);
    }
}
