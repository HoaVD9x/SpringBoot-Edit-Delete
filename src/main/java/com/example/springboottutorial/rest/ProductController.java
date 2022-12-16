package com.example.springboottutorial.rest;

import com.example.springboottutorial.dao.AttemptsRepository;
import com.example.springboottutorial.dao.ProductRepository;
import com.example.springboottutorial.model.Products;
import com.example.springboottutorial.payload.ProductPayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private AttemptsRepository attemptsRepository;

    @GetMapping("/products")
    public ResponseEntity<List<Products>> getListProduct() {
        return ResponseEntity.ok(productRepository.findAll());
    }

    @GetMapping("edit/{productCode}")
    public ResponseEntity<Products> editProduct (@PathVariable ("productCode") String productCode) {

       Products products = productRepository.findById(productCode).orElseThrow(() -> new IllegalArgumentException("Invalid user Id: " + productCode) );
        return ResponseEntity.ok().build();
    }



    @PostMapping("/products")
    public ResponseEntity<Void> save(@RequestBody ProductPayload payload) {
        System.out.println(payload);
        Products products = new Products(UUID.randomUUID().toString(), payload.getProductName(),
                payload.getProductLine(), payload.getProductScale(), payload.getProductVendor(),
                payload.getProductDescription(), payload.getQuantityInStock(), payload.getBuyPrice(),
                payload.getMsrp(), payload.getProductImageLink());
        productRepository.save(products);
        return ResponseEntity.ok().build();
    }



    @DeleteMapping("/product/{productCode}")
    public ResponseEntity<Void> delete (@PathVariable("productCode") String productCode) {
       productRepository.deleteById(productCode);
       return ResponseEntity.ok().build();

    }
}
