/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "name")
    private String name;
    
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "addr")
    private String addr;
    
    @Column(name = "dob")
    private String dob;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "IDrole")
    private Integer IDrole;

    public User() {
    }
    
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public User(String name, String username, String password, Integer IDrole) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.IDrole = IDrole;
    }

    public User(String name, String username, String password, String addr, String dob, String phone, String email, Integer IDrole) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.addr = addr;
        this.dob = dob;
        this.phone = phone;
        this.email = email;
        this.IDrole = IDrole;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIDrole() {
        return IDrole;
    }

    public void setIDrole(Integer IDrole) {
        this.IDrole = IDrole;
    }

    
   
    
    

}
