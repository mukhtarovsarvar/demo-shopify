package org.example.demoshopify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class DemoShopifyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoShopifyApplication.class, args);
    }

}
