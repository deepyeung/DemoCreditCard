package com.example.democreditcard.serviceImp;

import com.example.democreditcard.interfaces.ProductRepository;
import com.example.democreditcard.interfaces.ProductService;
import com.example.democreditcard.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductImp implements ProductService {

    @Autowired(required = false)
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {

        productRepository.save(product);
        return product; //回傳小寫product,顯示下層postman
    }

    @Override
    public Product getProduct(Product product) {

        productRepository.save(product);
        return product; //回傳小寫product
    }

    @Override
    public void deleteProductById(long cardSerial) {

        this.productRepository.deleteById(cardSerial);
    }

    @Override
    public Product getProductById(Long id) {
        Optional<Product> optional = productRepository.findById(id);
        Product product = null;
        if (optional.isPresent()){
            product = optional.get();
        }
        return product;
    }
}
