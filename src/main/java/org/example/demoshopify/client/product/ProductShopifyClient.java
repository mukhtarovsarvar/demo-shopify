package org.example.demoshopify.client.product;

import feign.Headers;
import org.example.demoshopify.config.FeignConfig;
import org.example.demoshopify.dto.product.Products;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author 'Mukhtarov Sarvarbek' on 11/11/2024
 * @project demo-shopify
 * @contact @sarvargo
 */
@FeignClient(
        name = "product-client",
        url = "${shopify.url}",
        configuration = FeignConfig.class
)
public interface ProductShopifyClient {
    @GetMapping("/admin/api/2024-10/products.json")
    Products getAll();
}
