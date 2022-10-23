package com.example.homework4;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public Shop() {
        products = new ArrayList<>();
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    public List<Product> getAllProducts() {
        return products;
    }

    public void addProduct(Product product) {
            products.add(product);
        }


    public void removeProduct(int id) {
        for (Product x : products) {
            if (x.getId() == id) {
                products.remove(x);
                return;
            }

        }
    }
    public void editProduct(Product product) {
         products.set(3,product);
        }
    }
