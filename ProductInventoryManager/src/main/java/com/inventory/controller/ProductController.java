package com.inventory.controller;

import com.inventory.entity.ProductDetails;
import com.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    //inject service in this
    @Autowired
    private ProductService productService;

    //Add product
    @PostMapping("/addProduct")
    public ResponseEntity<String> addProduct(@RequestBody ProductDetails product){
        System.err.println(product);
        productService.saveProduct(product);
        return new ResponseEntity<>("Product added", HttpStatus.CREATED);
    }

    //Get all product api added
    @GetMapping("/getAllProduct")
    public ResponseEntity<List<ProductDetails>> getAllProduct(){
        List<ProductDetails> productDetailsList = productService.getAllProduct();
        return new ResponseEntity<>(productDetailsList, HttpStatus.OK);
    }

    //get product by id api added
    @GetMapping("/getProductById/{id}")
    public ResponseEntity<ProductDetails> getProById(@PathVariable int id){
        ProductDetails productById= productService.getById(id);
        return new ResponseEntity<>(productById,HttpStatus.OK);
    }

    //delete api added
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePro(@PathVariable("id") int id){
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product deleted",HttpStatus.OK);
    }

    //update api added
    @PutMapping("/update/{id}")
    public ResponseEntity<ProductDetails> updatePro(@PathVariable("id") int id,@RequestBody ProductDetails pro){
       ProductDetails updateProduct = productService.updateProduct(id,pro);
       return new ResponseEntity<>(updateProduct,HttpStatus.OK);
    }

    //add list of products
    @PostMapping("/addList")
    public ResponseEntity<String> addList(List<ProductDetails> productList){
        productService.saveProList(productList);
        return new ResponseEntity<>("List saved",HttpStatus.OK);
    }
}
