package com.tech552.democ9.services;

import com.tech552.democ9.model.Product;
import com.tech552.democ9.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    //Fake DB
//private List<Product> products = new ArrayList<>(
//
//        Arrays.asList(
//                new Product(1, "Bread", 20.0),
//                new Product(2, "Milk", 30.0),
//                new Product(3, "Chocolate", 40.0)
//        )
//
//);
    @Autowired
    ProductRepository productRepository;

    //Get all the Products in our List
    public List<Product>getAllProducts(){
List<Product> listOfProducts = new ArrayList<>();
      productRepository.findAll().forEach(listOfProducts::add);
      return listOfProducts;
    }


    //Add a Product
    public void addProduct(Product product){
        productRepository.save(product);
    }

    //Get by Id

    public Optional<Product> getProductById(Integer id){
       return  productRepository.findById(id);
//        for (Product product: products) {
//            if(product.getId().equals(id)){
//                return product;
//            }
//        }
//        return null;
    }


    //Update
    public void updateProduct(Product product){
        productRepository.save(product);
//        for(int x = 0; x < products.size(); x++){
//            Product p = products.get(x); //for each
//            if(p.getId().equals(id)){ //compare to what is passed in
//                products.set(x,product); //topic from parameter passed in
//            }
//        }
    }


    //Delete
    public void deleteProduct(Integer id){
        productRepository.deleteById(id);
//        for(int x = 0; x < products.size(); x++){
//            Product product = products.get(x);
//            if(product.getId().equals(id)){
//                products.remove(x);
//            }
//        }
    }

}
