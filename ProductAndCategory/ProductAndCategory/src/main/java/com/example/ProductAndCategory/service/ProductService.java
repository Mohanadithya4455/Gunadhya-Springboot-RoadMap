package com.example.ProductAndCategory.service;


import com.example.ProductAndCategory.models.Category;
import com.example.ProductAndCategory.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {
    public Product createProduct(int categoryId, Product product) throws Exception;
    public Product findById(int id) throws Exception;
    public List<Product> findAllProducts(int pageNo,int size);
    public Page<Product> findByCategory(int id, int pageNo, int size) throws Exception;
    public Product updateProduct(int id,Product product) throws Exception;
    public void deleteProduct(int id) throws Exception;
    public Product updateProfilePic(int id, MultipartFile file) throws Exception;
}
