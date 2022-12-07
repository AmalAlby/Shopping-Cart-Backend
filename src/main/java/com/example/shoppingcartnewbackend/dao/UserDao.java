package com.example.shoppingcartnewbackend.dao;


import com.example.shoppingcartnewbackend.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends CrudRepository<User,Integer> {

  @Query(value = "SELECT `id`, `address`, `cpassword`, `emailid`, `name`, `password`, `phonenumber` FROM `userdetails` WHERE `name` LIKE %:name%",nativeQuery = true)
  List<User> SearchUser(@Param("name") String name);
}
