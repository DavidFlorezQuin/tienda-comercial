package com.tiendacomercial.persistence.mapper;

import com.tiendacomercial.domain.Product;
import com.tiendacomercial.persistence.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

//Indica que es un Mappeador que usa spring y que también está conectado con otro mappeador
@Mapper(componentModel = "spring", uses = {CategoryMapper.class})
public interface ProductMapper  {

    //Conversores
    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category")
    })

    //Definimos como deseamos convertilo
    Product toProduct(Producto producto);

    //Recibe una lista de Productos
    List<Product> toProducts(List<Producto> productos);


    //Operacion inversa
    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);
}
