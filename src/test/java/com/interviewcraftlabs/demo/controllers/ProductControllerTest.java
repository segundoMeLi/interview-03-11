package com.interviewcraftlabs.demo.controllers;

import com.interviewcraftlabs.demo.models.Categories;
import com.interviewcraftlabs.demo.models.Product;
import com.interviewcraftlabs.demo.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest
public class ProductControllerTest {


    @Autowired
    private MockMvc mockMvc;

    @Mock
    private ProductRepository productRepository;

    @Test
    public void testGetProductsEndpoint() throws Exception {
        MockitoAnnotations.openMocks(this);
        List<Product> expectedReturn = Arrays.asList(
                new Product(123L, "mocked descrpition", 10L, Categories.CAT2));

        Mockito.when(productRepository.findAll()).thenReturn(expectedReturn);

        this.mockMvc.perform(get("/api/productos"))
                .andExpect(status().isOk());

    }
}
