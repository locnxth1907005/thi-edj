package com.example.thispring.api;

import com.example.thispring.entity.Product;
import com.example.thispring.entity.Sale;
import com.example.thispring.repository.JPAProductRepository;
import com.example.thispring.repository.JPASalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/ejb")
public class ProductAPI {
    @Autowired
    private JPAProductRepository jpaProductRepository;
    private static ArrayList<Product> list = new ArrayList<>();


    @GetMapping(value = "/create")
    public Product save(@RequestBody Product product){
        jpaProductRepository.save(product);
        return product;
    }
    @GetMapping(value = "/{id}")
    public Product getDetail(@PathVariable String id){
        Product product = null;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getProductId().equals(id)){
                product =list.get(i);
                break;
            }
        }
        return product;
    }
}
