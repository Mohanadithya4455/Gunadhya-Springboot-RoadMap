package com.example.ProductAndCategory.repository;

import com.example.ProductAndCategory.models.Category;
import com.example.ProductAndCategory.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    public Page<Product> findByCategory(Pageable pageable, Category category);
}
