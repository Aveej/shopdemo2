package com.example.shopdemo2.product;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.hibernate.loader.Loader.SELECT;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

//    @Query("SELECT p FROM Product p WHERE p.price LIKE %?1%")
    List<Product> findByPrice(Long price);

    @Query("SELECT p FROM Product p WHERE p.category LIKE %?1%")
    List<Product> findProductByCategory(String category);
}
