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

    List<Product> findProductByPriceBetween(Long start, Long end);

}
