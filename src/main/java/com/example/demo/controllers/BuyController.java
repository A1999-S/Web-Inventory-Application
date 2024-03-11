package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class BuyController {
    private ProductService productService;

    public BuyController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/buy")
    public String buy(@RequestParam("Id") int theId) {
//        System.out.println("Decrement product id of: " + theId);

        // retrieve product
        Product product1 = productService.findById(theId);
        // check if already 0
        if (product1.getInv() > 0) {
            product1.setInv(product1.getInv() - 1);
            productService.save(product1);
//        System.out.println("--------Set the product to 0!-----");
            return "confirmationbuyproduct";
        }
        return "buyerror";




    }

}