package com.itom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itom.mapper")
public class DikeApplication {
    public static void main(String[] args) {
        SpringApplication.run(DikeApplication.class, args);
    }
}
