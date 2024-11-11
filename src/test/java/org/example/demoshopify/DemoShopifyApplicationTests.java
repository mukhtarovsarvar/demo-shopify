package org.example.demoshopify;

import org.example.demoshopify.client.product.ProductShopifyClient;
import org.example.demoshopify.dto.product.Products;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoShopifyApplicationTests {
    @Autowired
    private ProductShopifyClient productShopifyClient;

    @Test
    void contextLoads() {
        Products all = productShopifyClient.getAll();
        all.getProducts().forEach(System.out::println);
    }

}
