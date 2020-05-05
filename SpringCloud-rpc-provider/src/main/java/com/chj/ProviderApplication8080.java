package com.chj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：chj
 * @date ：Created in 2020/5/4 20:46
 * @params :
 */
@SpringBootApplication
@MapperScan("com.chj.mapper")
public class ProviderApplication8080 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication8080.class,args);
    }
}
