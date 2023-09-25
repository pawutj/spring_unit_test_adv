package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class ProductService {
    @Autowired
    protected ProductRepository productRepository;

    public List<ProductEntity> getProduct(String name){
        return productRepository.findByName(name);
    }

}
