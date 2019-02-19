package com.lee.mybatis_one2many;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lee.mybatis_one2many.mapper")
@SpringBootApplication
public class MybatisOne2manyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisOne2manyApplication.class, args);
    }

}
