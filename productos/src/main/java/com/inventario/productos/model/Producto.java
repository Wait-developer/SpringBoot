
package com.inventario.productos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Producto {
    @Id
    @Column
    private Long idProducto;
    
    private String nombre;
    
    private double precio;
    
    private String descripcion;
    

}
    
    

