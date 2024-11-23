
package com.inventario.productos.services;

import com.inventario.productos.model.Producto;


public interface ProductoService {
    
    Producto newProducto (Producto newProducto);
    Iterable<Producto> getAll();
    Producto modifyProducto (Producto producto);
    Boolean deleteProducto (Long idProducto);
    
}
