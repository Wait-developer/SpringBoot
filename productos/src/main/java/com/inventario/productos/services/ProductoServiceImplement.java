
package com.inventario.productos.services;

import com.inventario.productos.model.Producto;
import com.inventario.productos.repository.ProductoRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoServiceImplement implements ProductoService {
    
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Producto newProducto(Producto newProducto) {
        return productoRepository.save(newProducto);
       }

    @Override
    public Iterable<Producto> getAll() {
        return this.productoRepository.findAll();    
       }

    @Override
    public Producto modifyProducto(Producto producto) {
       Optional<Producto> productoEncontrado = this.productoRepository.findById(producto.getIdProducto());
       if(productoEncontrado.get() !=null) {
             productoEncontrado.get().setNombre(producto.getNombre());
                 
             productoEncontrado.get().setPrecio(producto.getPrecio());
                     
             productoEncontrado.get().setDescripcion(producto.getDescripcion());
         
             return this.newProducto(productoEncontrado.get());
       }
       return null;
    }
    @Override
    public Boolean deleteProducto(Long idProducto) {
           this.productoRepository.deleteById(idProducto); 
           return true;
    }
    }



