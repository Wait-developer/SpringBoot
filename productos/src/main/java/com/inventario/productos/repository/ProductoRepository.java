
package com.inventario.productos.repository;

import com.inventario.productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
