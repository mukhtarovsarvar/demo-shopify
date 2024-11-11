package org.example.demoshopify.config;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 'Mukhtarov Sarvarbek' on 11/11/2024
 * @project demo-shopify
 * @contact @sarvargo
 */
@Configuration
public class FeignConfig {
    @Value("${shopify.access_token}")
    private String accessToken;
    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> requestTemplate.header("X-Shopify-Access-Token", accessToken);
    }
}
