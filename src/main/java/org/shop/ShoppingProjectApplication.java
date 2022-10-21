package org.shop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "org.shop.mapper")  // Mapper 인터페이스스캔 활성화
public class ShoppingProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingProjectApplication.class, args);
    }

}
