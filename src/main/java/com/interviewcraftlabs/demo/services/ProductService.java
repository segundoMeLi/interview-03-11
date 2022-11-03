package com.interviewcraftlabs.demo.services;

import com.interviewcraftlabs.demo.models.Categories;
import com.interviewcraftlabs.demo.models.Product;
import com.interviewcraftlabs.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.PrimitiveIterator;
import java.util.stream.Collectors;

public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> findProductByCategory(Categories category){

        return productRepository
                .findAll().stream()
                .filter(product -> product.getCategory().equals(category))
                .collect(Collectors.toList());
    }
}
