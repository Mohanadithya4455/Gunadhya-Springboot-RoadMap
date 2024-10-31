package com.example.ProductAndCategory.service;

import com.example.ProductAndCategory.models.Category;
import com.example.ProductAndCategory.models.Product;
import com.example.ProductAndCategory.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoryServiceImplementation implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Category createCatetgory(Category category) {
        Category category1 = new Category();
        category1.setCategoryName(category.getCategoryName());
        category1.setProduct(new ArrayList<>());
        return categoryRepository.save(category1);
    }

    @Override
    public Category findById(int id) throws Exception {
        Optional<Category> category = categoryRepository.findById(id);
        if(category.isPresent()){
            return category.get();
        }
        throw new Exception("Category not found with this "+id);

    }
}
