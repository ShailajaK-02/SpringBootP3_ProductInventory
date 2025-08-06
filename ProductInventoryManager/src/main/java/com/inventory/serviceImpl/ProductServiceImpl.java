package com.inventory.serviceImpl;

import com.inventory.entity.ProductDetails;
import com.inventory.repository.ProductRepository;
import com.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService
{
    //inject repository in this
    @Autowired
    private ProductRepository repository;

    @Override
    public String saveProduct(ProductDetails product) {
        ProductDetails productDetails = repository.save(product);
        return "Product added";
    }

    @Override
    public List<ProductDetails> getAllProduct() {
        List<ProductDetails> productDetails = repository.findAll();
        return productDetails;
    }

    @Override
    public ProductDetails getById(int id) {
        ProductDetails productDetails = repository.findById(id).orElseThrow(()->new NullPointerException("Data not found" +id));
        return productDetails;
    }

    @Override
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product deleted";
    }

    @Override
    public ProductDetails updateProduct(int id, ProductDetails newPro) {
        ProductDetails productDetails = repository.findById(id).orElseThrow(()->new NullPointerException("Data not found"+id));

        productDetails.setPrice(newPro.getPrice());

        ProductDetails updatedPro = repository.save(productDetails);
        return updatedPro;
    }
}
