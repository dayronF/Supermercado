package com.supermercado.inventario.entity;

import java.util.Locale.Category;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class productsEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;
    @Column(name ="barcode")
    String barcode;
    @Column(name = "price")
    double price;
    @Column(name ="stock")
    int stock;
    @Column(name = "state") 
    boolean state = true;   
    @ManyToOne
    @JoinColumn(name = "categories_id")
    Category category;
}