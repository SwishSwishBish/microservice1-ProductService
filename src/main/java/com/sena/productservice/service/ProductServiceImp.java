package com.sena.productservice.service;

import com.sena.productservice.model.Product;
import com.sena.productservice.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductServiceImp implements IProductService{

    private final IProductRepository productRepository;

    public ProductServiceImp(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product){
        product.setCreateTime(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long productId) {
        productRepository.deleteById(productId);
    }

    @Override
    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}
