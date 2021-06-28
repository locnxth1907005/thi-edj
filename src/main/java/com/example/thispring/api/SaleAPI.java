package com.example.thispring.api;

import com.example.thispring.entity.Sale;
import com.example.thispring.repository.JPASalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/ejb")
public class SaleAPI {
    @Autowired
    private JPASalesRepository jpaSalesRepository;
    private static ArrayList<Sale> list = new ArrayList<>();


    @GetMapping(value = "/create")
    public Sale save(@RequestBody Sale sale){
        jpaSalesRepository.save(sale);
        return sale;
    }
    @GetMapping(value = "/{id}")
    public Sale getDetail(@PathVariable String id){
        Sale sale = null;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getSaleNo().equals(id)){
                sale =list.get(i);
                break;
            }
        }
        return sale;
    }
}
