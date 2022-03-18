package com.example.shopdemo2.product;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    List<Product> findByPrice(Long price);

    List<Product> findProductByCategory(String category);

    @Query("from Product where price between :min and :max")
    List<Product> findProductByPriceBetween(Long min, Long max);

    List<Product> findProductByCategoryAndPrice(String category, Long price);

//    @Query("from Product where category And price between :min and :max")
    List<Product> findProductByCategoryAndPriceBetween(String category, Long min, Long max);

}
