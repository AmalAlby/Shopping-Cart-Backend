package com.example.shoppingcartnewbackend.dao;

import com.example.shoppingcartnewbackend.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductDao extends CrudRepository<Product,Integer> {
    @Query(value = "SELECT `id`, `category`, `imagelink`, `name`, `price` FROM `products` WHERE `name` LIKE %:name%",nativeQuery = true)
    List<Product> SearchProduct(@Param("name") String name);
}
