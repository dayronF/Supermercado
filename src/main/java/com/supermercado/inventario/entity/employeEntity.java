package com.supermercado.inventario.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "employee")
public class employeEntity {

    @Id
    @Column(name = "id")
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "post")
    String post;
    @Column(name = "entry_date")
    LocalDate entry_date;
    @Column(name = "salary")
    double salary;

}
