package com.example.ProductAndCategory.controller;

import com.example.ProductAndCategory.models.Product;
import com.example.ProductAndCategory.service.ProductServiceImplementation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServiceImplementation productServiceImplementation;
    @PostMapping("/create/{categoryId}")
    public ResponseEntity<Product> createProduct(@PathVariable("categoryId") int id,@Valid @RequestBody Product product) throws Exception {
       Product product1 = productServiceImplementation.createProduct(id,product);
       return new ResponseEntity<>(product1, HttpStatus.CREATED);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Product> findById(@PathVariable("id") int id) throws Exception {
        Product product = productServiceImplementation.findById(id);
        return new ResponseEntity<>(product,HttpStatus.OK);
    }

    @GetMapping("/getAll/{pageNo}/{size}")
    public  ResponseEntity<List<Product>> getAllProducts(@PathVariable("pageNo") int pageNo,@PathVariable("size") int size){
        List<Product> list = productServiceImplementation.findAllProducts(pageNo,size);
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

    @GetMapping("/getByCategory/{id}/{pageNo}/{size}")
    public ResponseEntity<Page<Product>> getAllByCategory(@PathVariable("id") int id, @PathVariable("pageNo") int pageNo, @PathVariable("size") int size) throws Exception {
        Page<Product> products = productServiceImplementation.findByCategory(id,pageNo,size);
        return new ResponseEntity<>(products,HttpStatus.OK);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") int id,@RequestBody Product product1) throws Exception {
        Product product = productServiceImplementation.updateProduct(id,product1);
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) throws Exception {
        productServiceImplementation.deleteProduct(id);
        return new ResponseEntity<>("successfully Deleted",HttpStatus.OK);
    }
    @PutMapping("/update/profilepic/{id}")
    public ResponseEntity<Product> updateProfilePic(@PathVariable("id") int id, @RequestParam("pic")MultipartFile file) throws Exception {
        Product product = productServiceImplementation.updateProfilePic(id,file);
        return new ResponseEntity<>(product,HttpStatus.OK);
    }
}
