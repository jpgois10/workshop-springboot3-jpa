package com.compass.course.services;

import com.compass.course.entities.Category;
import com.compass.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(Long id) {
//        Optional<Category> obj = categoryRepository.findById(id);
//        return obj.get();
        return categoryRepository.findById(id).get();
    }
}
