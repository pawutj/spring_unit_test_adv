package com.example.demo;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @InjectMocks
    ProductService productService;

    @Mock
    ProductRepository productRepository;

    @Test
    void TestGetProducts(){
        List<ProductEntity> products = new ArrayList<>();
        ProductEntity p = new ProductEntity();
        products.add(p);

        when(productRepository.findByName(any())).thenReturn(products);

        List<ProductEntity> result = productService.getProduct("");
        assertEquals(result.size(),1);
    }


}
