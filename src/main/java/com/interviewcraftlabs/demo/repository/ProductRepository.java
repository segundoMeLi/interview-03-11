package com.interviewcraftlabs.demo.repository;

import com.interviewcraftlabs.demo.models.Categories;
import com.interviewcraftlabs.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {

    public List<Product> findAll(){
        return Arrays.asList(
                new Product(123L, "mocked descrpition", 10L, Categories.CAT1),
                new Product(124L, "mocked descrpition 2", 15L, Categories.CAT1),
                new Product(125L, "mocked descrpition 3", 20L, Categories.CAT2)
        );
    }
}
