package com.supermercado.inventario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import jakarta.persistence.GenerationType;

@Entity
@Data
@Table(name = "categories")

public class categoriesEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;

@Column(name = "name")
String name;

}
