package com.sena.productservice.service;

import com.sena.productservice.model.Product;

import java.util.List;

public interface IProductService {

    Product saveProduct(Product product);
    void deleteProduct(Long productId);
    List<Product> findAllProducts();
}
