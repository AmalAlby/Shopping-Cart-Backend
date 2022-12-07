package com.example.shoppingcartnewbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingCartController {

    @PostMapping("/addp")
    public String addproduct(){
        return "Add product successfull";
    }

    @GetMapping("/viewp")
    public String viewproduct(){
        return "View successfull";
    }

    @PostMapping("/searchp")
    public String searchproduct(){
        return "Search successfull";
    }

}
