package com.inventory.service;

import com.inventory.entity.ProductDetails;

import java.util.List;

public interface ProductService
{
    //save method added
    String saveProduct(ProductDetails product);

    List<ProductDetails> getAllProduct();

    ProductDetails getById(int id);

    String deleteProduct(int id);

    ProductDetails updateProduct(int id, ProductDetails newPro);
}
