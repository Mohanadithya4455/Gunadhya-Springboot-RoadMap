package com.example.ProductAndCategory.controller;


import com.example.ProductAndCategory.models.Category;
import com.example.ProductAndCategory.service.CategoryService;
import com.example.ProductAndCategory.service.CategoryServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImplementation categoryServiceImplementation;
    @PostMapping("/create")
    public ResponseEntity<Category> createCategory(@RequestBody Category category){
        Category category1 = categoryServiceImplementation.createCatetgory(category);
        return new ResponseEntity<>(category1, HttpStatus.CREATED);
    }
    @GetMapping("get/{id}")
    public ResponseEntity<Category> findById(@PathVariable("id") int id) throws Exception {
        Category category = categoryServiceImplementation.findById(id);
        return new ResponseEntity<>(category,HttpStatus.OK);
    }
}
