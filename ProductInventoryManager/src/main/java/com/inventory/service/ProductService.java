package com.inventory.service;

import com.inventory.entity.ProductDetails;

import java.util.List;

public interface ProductService
{
    //save method
    String saveProduct(ProductDetails product);

    //getalldata method
    List<ProductDetails> getAllProduct();

    //getbyid method added
    ProductDetails getById(int id);

    //delete method
    String deleteProduct(int id);

    //update method
    ProductDetails updateProduct(int id, ProductDetails newPro);

    //save list of products
    String saveProList(List<ProductDetails> productList);
}
