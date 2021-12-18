package com.example.flowers.services;

import com.example.flowers.entities.Product;
import com.example.flowers.entities.ProductCategory;
import com.example.flowers.entities.ProductMaterial;

import java.util.List;

public interface ProductService {
    List<Product> getProducts();
    List<Product> getProducts(ProductCategory category);
    List<ProductCategory> getProductCategories();
    List<ProductMaterial> getProductMaterials();
    Product add(Product film);
    void delete(Product film);
    void edit(Product film);
    Product getById(int id);
}

