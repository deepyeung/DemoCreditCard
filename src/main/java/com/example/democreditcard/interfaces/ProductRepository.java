package com.example.democreditcard.interfaces;

import com.example.democreditcard.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}