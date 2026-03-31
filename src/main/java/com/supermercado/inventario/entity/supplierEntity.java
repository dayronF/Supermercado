package com.supermercado.inventario.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "suppliers")
public class supplierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;

    @Column(name = "nit")
    String nit;

    @Column(name = "name")
    String name;

}
