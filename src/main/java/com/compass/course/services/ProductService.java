package com.compass.course.services;

import com.compass.course.entities.Product;
import com.compass.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
//        Optional<Product> obj = productRepository.findById(id);
//        return obj.get();
        return productRepository.findById(id).get();
    }
}
