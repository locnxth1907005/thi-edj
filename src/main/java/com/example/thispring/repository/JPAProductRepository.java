package com.example.thispring.repository;

import com.example.thispring.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPAProductRepository extends JpaRepository<Product, String> {
}
