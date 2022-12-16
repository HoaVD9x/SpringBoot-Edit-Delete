package com.example.springboottutorial.dao;

import com.example.springboottutorial.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products, String> {
    Products findByProductCode(String productCode);

}
