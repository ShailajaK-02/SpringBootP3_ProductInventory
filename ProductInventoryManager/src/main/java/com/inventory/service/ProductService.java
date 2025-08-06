package com.inventory.service;

import com.inventory.entity.ProductDetails;

import java.util.List;

public interface ProductService
{
    //save method added
    String saveProduct(ProductDetails product);

    //getalldata method added
    List<ProductDetails> getAllProduct();

    //getbyid method added
    ProductDetails getById(int id);

    //delete method
    String deleteProduct(int id);

    //update method
    ProductDetails updateProduct(int id, ProductDetails newPro);
}
