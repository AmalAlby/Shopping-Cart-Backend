package com.example.shoppingcartnewbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "userdetails")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private String emailid;
    private String phonenumber;
    private String password;
    private String cpassword;

    public User() {
    }

    public User(int id, String name, String address, String emailid, String phonenumber, String password, String cpassword) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.emailid = emailid;
        this.phonenumber = phonenumber;
        this.password = password;
        this.cpassword = cpassword;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCpassword() {
        return cpassword;
    }

    public void setCpassword(String cpassword) {
        this.cpassword = cpassword;
    }
}