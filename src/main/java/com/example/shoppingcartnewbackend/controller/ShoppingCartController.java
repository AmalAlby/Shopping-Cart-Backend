package com.example.shoppingcartnewbackend.controller;

import com.example.shoppingcartnewbackend.dao.ProductDao;
import com.example.shoppingcartnewbackend.dao.UserDao;
import com.example.shoppingcartnewbackend.model.Product;
import com.example.shoppingcartnewbackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShoppingCartController {

    @Autowired
    private ProductDao dao;
    @Autowired
    private UserDao udao;

    @CrossOrigin(origins = "*")
    @PostMapping(path="/addp",consumes ="application/json",produces ="application/json")
    public Map<String,String> addproduct(@RequestBody Product p){
        dao.save(p);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map ;
    }

    @CrossOrigin(origins ="*")
    @GetMapping("/viewp")
    public List<Product> viewproduct(){
        return (List<Product>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/searchp",consumes = "application/json",produces = "application/json")
    public List<Product> searchproduct(@RequestBody Product p){
        String pname=p.getName().toString();
        System.out.println(pname);
        return (List<Product>) dao.SearchProduct(p.getName()) ;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/addu",consumes ="application/json",produces ="application/json")
    public Map<String,String> adduser(@RequestBody User u){
        udao.save(u);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map ;
    }

    @CrossOrigin(origins ="*")
    @GetMapping("/viewu")
    public List<User> viewuser(){
        return (List<User>) udao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path="/searchu",consumes = "application/json",produces = "application/json")
    public List<User> searchuser(@RequestBody User u){
        String pname= u.getName().toString();
        System.out.println(pname);
        return (List<User>) udao.SearchUser(u.getName()) ;
    }









}
