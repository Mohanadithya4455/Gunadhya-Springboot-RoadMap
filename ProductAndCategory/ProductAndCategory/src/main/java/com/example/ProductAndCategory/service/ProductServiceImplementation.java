package com.example.ProductAndCategory.service;

import com.example.ProductAndCategory.models.Category;
import com.example.ProductAndCategory.models.Product;
import com.example.ProductAndCategory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ProductServiceImplementation implements ProductService{

    @Autowired
    CategoryServiceImplementation categoryServiceImplementation;
    @Autowired
    ProductRepository productRepository;
    @Value("$product.image")
    private String path;
    @Override
    public Product createProduct(int categoryId, Product product) throws Exception {
        Category category1 = categoryServiceImplementation.findById(categoryId);
        Product product1 = new Product();
        product1.setProductName(product.getProductName());
        product1.setId(product.getId());
        product1.setCategory(category1);
        product1.setPrice(product.getPrice());
        product1.setDiscount(product.getDiscount());
        int productPriceAfterDiscount = product.getPrice()-(product.getPrice()*(product.getDiscount())/100);
        product1.setPriceAfterDiscountAdded(productPriceAfterDiscount);
        product.setImage(" ");
        category1.getProduct().add(product1);
        return productRepository.save(product1);
    }


    @Override
    public Product findById(int id) throws Exception {
        Optional<Product> product = productRepository.findById(id);
        if(product.isPresent()){
            return product.get();
        }
        throw new Exception("Product is not found with this id: "+id);
    }

    @Override
    public List<Product> findAllProducts(int pageNo,int size) {
        Pageable pageable = PageRequest.of(pageNo, size);
        Page<Product> p=productRepository.findAll(pageable);
        return p.getContent();
    }

    @Override
    public Page<Product> findByCategory(int id,int pageNo,int size) throws Exception {
        Category category = categoryServiceImplementation.findById(id);

         Pageable pageable = PageRequest.of(pageNo,size);
         Page<Product> page = productRepository.findByCategory(pageable,category);
        return page;
    }

    @Override
    public Product updateProduct(int id,Product product) throws Exception {
         Product product1 = findById(id);
         if(product.getProductName()!=null){
             product1.setProductName(product.getProductName());
         }
         if(product.getPrice()!=0){
             product1.setPrice(product.getPrice());
         }
         if(product.getDiscount()!=0){
             product1.setDiscount(product.getDiscount());
         }
        int productPriceAfterDiscount = product1.getPrice()-(product1.getPrice()*(product1.getDiscount())/100);
        product1.setPriceAfterDiscountAdded(productPriceAfterDiscount);
        return productRepository.save(product1);
    }

    @Override
    public void deleteProduct(int id) throws Exception {
        Product product = findById(id);
        productRepository.delete(product);
    }

    @Override
    public Product updateProfilePic(int id, MultipartFile file) throws Exception {
        Product product = findById(id);
        String filePath = updateImage(path,file);
        product.setImage(filePath);
        return productRepository.save(product);
    }

    private String updateImage(String path, MultipartFile file) throws IOException {
        String originalFilename = file.getOriginalFilename();
        String uniquePath = UUID.randomUUID().toString();
        String filePath = uniquePath.concat(originalFilename.substring(originalFilename.lastIndexOf(".")));
        String fullPath=path + File.separator + filePath;
        File f = new File(path);
        if(!f.exists()){
            f.mkdir();
        }
        Files.copy(file.getInputStream(),Paths.get(fullPath));
        return filePath;
    }

}
