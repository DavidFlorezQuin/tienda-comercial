package com.tiendacomercial.domain.repository;

import com.tiendacomercial.domain.Product;

import java.util.List;
import java.util.Optional;

//Es quien define lo que queremos retornar
public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);

}
