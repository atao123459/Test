package com.even.wj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class WjApplication {

    public static void main(String[] args) {
        SpringApplication.run(WjApplication.class, args);
    }

}
