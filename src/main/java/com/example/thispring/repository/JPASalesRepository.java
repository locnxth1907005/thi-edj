package com.example.thispring.repository;

import com.example.thispring.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JPASalesRepository extends JpaRepository<Sale,String> {
}
