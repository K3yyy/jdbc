package model.dao;

import model.entity.Product;

import java.util.List;

public interface ProductDAO {
    void addProduct(Product product);
    void deleteProduct(int id);
    List<Product> getAllProducts();
}
