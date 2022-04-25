package com.example.democreditcard.interfaces;

import com.example.democreditcard.models.Product;


public interface ProductService {

   public Product saveProduct(Product product);

    Product getProduct(Product product);

    void deleteProductById(long cardSerial);

    public  Product getProductById(Long cardSerial);
}
