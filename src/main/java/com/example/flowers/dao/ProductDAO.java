package com.example.flowers.dao;

import com.example.flowers.entities.Product;
import com.example.flowers.entities.ProductCategory;
import com.example.flowers.entities.ProductMaterial;

import java.util.List;

public interface ProductDAO {
    List<Product> getProducts();
    List<Product> getProducts(ProductCategory category);
    List<ProductCategory> getProductCategories();
    List<ProductMaterial> getProductMaterials();
    void add(Product product);
    void delete(Product product);
    void edit(Product product);
    Product getById(int id);
}

