package com.example.thispring.api;

import com.example.thispring.entity.Product;
import com.example.thispring.entity.Sale;
import com.example.thispring.repository.JPASalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/ejb")
public class SeedAPI {
    @Autowired
    private JPASalesRepository jpaSalesRepository;

    @GetMapping(value = "/createSeed")
    private SeedAPI seedAPI() {
        if (jpaSalesRepository.findAll().size() == 0) {
            List<Sale> saleList = new ArrayList<>();

            Product product1 = new Product();
            product1.setPrice(30000L);
            product1.setDescription("Rain Boots");
            product1.setProductId("Boots");
            product1.setDateOfManf(1624542086000L);

            Product product2 = new Product();
            product2.setPrice(99999999L);
            product2.setDescription("AK47");
            product2.setProductId("Gun");
            product2.setDateOfManf(1624714886000L);

            Sale sale1 = new Sale();
            sale1.setSalesManId(1L);
            sale1.setSalesManName("Locdeptrai");
            sale1.setDOS(1622887686000L);
            sale1.setProduct(product1);

            Sale sale2 = new Sale();
            sale2.setSalesManId(2L);
            sale2.setSalesManName("Locnx");
            sale2.setDOS(1624369286000L);
            sale2.setProduct(product1);

            Sale sale3 = new Sale();
            sale3.setSalesManId(3L);
            sale3.setSalesManName("NXLoc");
            sale3.setDOS(1623505286000L);
            sale3.setProduct(product1);

            Sale sale4 = new Sale();
            sale4.setSalesManId(4L);
            sale4.setSalesManName("LocNguyen");
            sale4.setDOS(1623678086000L);
            sale4.setProduct(product2);

            Sale sale5 = new Sale();
            sale5.setSalesManId(5L);
            sale5.setSalesManName("Loclo");
            sale5.setDOS(1624369286000L);
            sale5.setProduct(product2);

            saleList.add(sale1);
            saleList.add(sale2);
            saleList.add(sale3);
            saleList.add(sale4);
            saleList.add(sale5);

            jpaSalesRepository.saveAll(saleList);
        }
            return seedAPI();
    }

    
}
