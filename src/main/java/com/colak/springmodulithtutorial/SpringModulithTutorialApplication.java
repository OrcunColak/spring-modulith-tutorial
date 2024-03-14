package com.colak.springmodulithtutorial;

import com.colak.springmodulithtutorial.product.ProductService;
import com.colak.springmodulithtutorial.product.ProductDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringModulithTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringModulithTutorialApplication.class, args)
                .getBean(ProductService.class)
                .create(new ProductDTO("product1", "course", 10));
    }

}
