package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

public class ProductExtendService extends ProductService {

    public List<ProductEntity> getProduct2(String name){
        List<ProductEntity> products = productRepository.findByName("");

        return products;
    }

    public List<ProductEntity> getProduct3(String name){
        List<ProductEntity> products = getProduct("");
        return products;
    }
}
