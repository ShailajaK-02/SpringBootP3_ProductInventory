package com.inventory.service;

import com.inventory.entity.ProductDetails;

import java.util.List;

public interface ProductService
{
    String saveProduct(ProductDetails product);

    List<ProductDetails> getAllProduct();

    ProductDetails getById(int id);
}
