package com.supermercado.inventario.repository;

import com.supermercado.inventario.entity.supermercadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface supermercadoRepository extends JpaRepository<supermercadoEntity, Long> {
}
