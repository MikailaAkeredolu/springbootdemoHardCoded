package com.tech552.democ9.services;

import com.tech552.democ9.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    //Fake DB
private List<Product> products = new ArrayList<>(

        Arrays.asList(
                new Product(1, "Bread", 20.0),
                new Product(2, "Milk", 30.0),
                new Product(3, "Chocolate", 40.0)
        )

);

    //Get all the Products in our List
    public List<Product>getAllProducts(){
        return products;
    }


    //Add a Product
    public void addProduct(Product product){
        products.add(product);
    }

    //Get by Id

    public Product getProductById(Integer id){
        for (Product product: products) {
            if(product.getId().equals(id)){
                return product;
            }
        }
        return null;
    }


    //Update
    public void updateProduct(Integer id, Product product){
        for(int x = 0; x < products.size(); x++){
            Product p = products.get(x); //for each
            if(p.getId().equals(id)){ //compare to what is passed in
                products.set(x,product); //topic from parameter passed in
            }
        }
    }


    //Delete
    public void deleteProduct(Integer id){
        for(int x = 0; x < products.size(); x++){
            Product product = products.get(x);
            if(product.getId().equals(id)){
                products.remove(x);
            }
        }
    }

}
