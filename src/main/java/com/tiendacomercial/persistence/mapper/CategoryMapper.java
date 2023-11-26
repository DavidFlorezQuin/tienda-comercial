package com.tiendacomercial.persistence.mapper;

import com.tiendacomercial.domain.Category;
import com.tiendacomercial.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring") //Para definir que es un mappeador
public interface CategoryMapper {

        //Conversores
        @Mappings({
                //Sorce es el fuente y target es donde lo quiero llevar
                @Mapping(source = "idCategoria", target = "categortId"),
                @Mapping(source = "descripcion", target = "category"),
                @Mapping(source = "estado", target = "active"),

        })
        Category toCategory(Categoria categoria); //->Convertimos una categoria en un category


        //Conversion externa
        @InheritInverseConfiguration //Indica la conversion que es inversa
        @Mapping(target = "productos", ignore = true) //Ignoramos atributos que no necesitaremos
        Categoria toCategoria(Category category);
}
