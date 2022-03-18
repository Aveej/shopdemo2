package com.example.shopdemo2.product;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    //    for view all

    public List<Product> getAllProduct(){
        return this.productRepo.findAll();
    }

    //    for save
    public void save(Product product)
    {
        productRepo.save(product);
    }

    //    for edit
    public void update(Product product, int id)
    {
        productRepo.save(product);
    }


    //    for delete
    public void delete(int id)
    {
        productRepo.deleteById(id);
    }

    public List<Product> getProductByPrice(Long price){
        return productRepo.findByPrice(price);
    }

    public List<Product> getProductByCategory(String category){
        return productRepo.findProductByCategory(category);
    }


    public List<Product> getProductByPriceBetween(Long min, Long max){
        return productRepo.findProductByPriceBetween(min, max);
    }

    public List<Product> getProductByCategoryAndPrice(String category, Long price){
        return productRepo.findProductByCategoryAndPrice(category, price);
    }

    public List<Product> getProductByCategoryAndPriceBetween(String category, Long min, Long max){
        return productRepo.findProductByCategoryAndPriceBetween(category, min, max);
    }
}

