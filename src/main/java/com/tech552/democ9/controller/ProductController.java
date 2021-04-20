package com.tech552.democ9.controller;

import com.tech552.democ9.model.Product;
import com.tech552.democ9.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    //GET all
    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    //POST product
    @RequestMapping(method = RequestMethod.POST, value = "/products")
    public void addProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    // Get product by ID
    @RequestMapping(method = RequestMethod.GET, value = "/products/{id}")
    public Optional<Product> getAProductById(@PathVariable Integer id){
        return productService.getProductById(id);
    }

    //update
    @RequestMapping(method = RequestMethod.PUT, value = "/products/{id}")
    public void updateCustomer( @PathVariable Integer id, @RequestBody Product product){
        productService.updateProduct(product);
    }

    //delete
    @RequestMapping(method = RequestMethod.DELETE, value = "/products/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        productService.deleteProduct(id);
    }



}
