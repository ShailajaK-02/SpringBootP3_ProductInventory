package com.inventory.service;

import com.inventory.entity.ProductDetails;

import java.util.List;

//service
public interface ProductService
{
    //save method
    String saveProduct(ProductDetails product);

    //getalldata method
    List<ProductDetails> getAllProduct();

    //getbyid method
    ProductDetails getById(int id);

    //delete method added
    String deleteProduct(int id);

    //update method added
    ProductDetails updateProduct(int id, ProductDetails newPro);

    //save list of products added
    String saveProList(List<ProductDetails> productList);
}
