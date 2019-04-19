package com.xidian.mybatis_pagehelp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xidian.mybatis_pagehelp.mapper"})
public class MybatisPagehelpApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPagehelpApplication.class, args);
    }

}
