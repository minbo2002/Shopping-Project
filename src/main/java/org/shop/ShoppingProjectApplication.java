package org.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.shop.mapper")
public class ShoppingProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingProjectApplication.class, args);
    }

}
