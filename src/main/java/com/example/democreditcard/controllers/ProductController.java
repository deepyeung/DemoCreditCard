package com.example.democreditcard.controllers;

import com.example.democreditcard.interfaces.ProductService;
import com.example.democreditcard.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired(required = false)
    private ProductService productService;
    private Product cardSerial;

    @PostMapping("/product/add")
    public Product add(@RequestBody Product product) {
        System.out.println("傳進去" + product.getCardTitle());//檢測傳進去的數據
        productService.saveProduct(product);
         return product;
    }

    @GetMapping("/product/all")
    public Product get(@RequestBody Product product) {
        System.out.println("取出來" + product.getCardTitle());//檢測取出來的數據
        productService.getProduct(product);
        return product;
    }

    @DeleteMapping("/product/{cardSerial}")
    public void delete(@PathVariable(value = "cardSerial") long cardSerial) {
        System.out.println("刪除" + cardSerial);
        productService.deleteProductById(cardSerial);
    }

    @PutMapping("/product/{cardSerial}")
    public ResponseEntity<?> update(@RequestBody Product product, @PathVariable(value = "cardSerial") Long cardSerial) {
        try {
            Product existProduct = productService.getProductById(cardSerial);
            if (existProduct == null) {
                return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
            }
            productService.saveProduct(product);
            return new ResponseEntity<Product>(HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
        }
    }
}
