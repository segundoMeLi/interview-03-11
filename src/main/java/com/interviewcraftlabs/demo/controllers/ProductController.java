package com.interviewcraftlabs.demo.controllers;

import com.interviewcraftlabs.demo.models.Categories;
import com.interviewcraftlabs.demo.models.Product;
import com.interviewcraftlabs.demo.repository.ProductRepository;
import com.interviewcraftlabs.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductController {

    @Autowired
    ProductService productRepository;

    @GetMapping()
    public List<Product> getProductos() {
        List<Product> products = productRepository.findAllProducts();
        return products;
    }

    @GetMapping("/category")
    public List<Product> getProductsByCategory(
            @RequestParam Categories category
            ){
        return productRepository.findProductByCategory(category);
    }
}
