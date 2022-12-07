package com.example.shoppingcartnewbackend.controller;

import com.example.shoppingcartnewbackend.model.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShoppingCartController {

    @CrossOrigin(origins = "*")
    @PostMapping(path="/addp",consumes ="application/json",produces ="application/json")
    public String addproduct(@RequestBody Product p){
        System.out.println(p.getName().toString());
        return "Add product successfull";
    }

    @CrossOrigin(origins ="*")
    @GetMapping("/viewp")
    public String viewproduct(){
        return "View successfull";
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/searchp")
    public String searchproduct(){
        return "Search successfull";
    }

}
