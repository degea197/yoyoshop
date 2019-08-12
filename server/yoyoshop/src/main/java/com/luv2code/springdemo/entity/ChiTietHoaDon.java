package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class ChiTietHoaDon {

    @Id
    private int ID;
    private Integer MaSP;
    private Integer SoLuong;

   


}
