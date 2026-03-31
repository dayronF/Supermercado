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

public class productsEntity{

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     int id;
    @Column(name = "name")
     String name;
     @Column(name = "barcode")
     String barcode;
     @Column(name = "price")
     double price;
     @Column(name = "stock")
     int stock;
     @Column(name = "state")
     boolean state;

    @ManyToOne
    @JoinColumn(name = "categories_id") // La columna FK de tu tabla products
    Category category;
}
}