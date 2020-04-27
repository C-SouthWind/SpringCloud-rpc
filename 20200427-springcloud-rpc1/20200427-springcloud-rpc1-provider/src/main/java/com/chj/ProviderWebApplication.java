package com.chj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：chj
 * @date ：Created in 2020/4/27 20:15
 * @params :
 */
@SpringBootApplication
@MapperScan("com.chj.mapper")
public class ProviderWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderWebApplication.class,args);
    }
}
