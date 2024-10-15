package com.example.ProductAndCategory.service;

import com.example.ProductAndCategory.models.Category;

public interface CategoryService {
    public Category createCatetgory(Category category);
    public Category findById(int id) throws Exception;
}
