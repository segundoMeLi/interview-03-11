package com.interviewcraftlabs.demo.config;

import com.interviewcraftlabs.demo.repository.ProductRepository;
import com.interviewcraftlabs.demo.services.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    @Bean
    public ProductService productService() {
        return new ProductService();
    }
}
