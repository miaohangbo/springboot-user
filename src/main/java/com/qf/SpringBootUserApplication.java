package com.qf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Created by 54110 on 2019/11/27.
 */
@SpringBootApplication
public class SpringBootUserApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootUserApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringBootUserApplication.class);
    }
}
