package com.laughing.dmdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * war包方式 不能直接run
 */

@SpringBootApplication
@MapperScan("com.laughing.dmdemo.mapper")
public class DmDemoApplication  extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DmDemoApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DmDemoApplication.class);
    }
}
