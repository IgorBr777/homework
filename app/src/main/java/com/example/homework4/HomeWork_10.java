package com.example.homework4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HomeWork_10 {
    public static void main(String[] args) {

        Shop shop = new Shop();

        Product firstProduct = new Product(2, "Apple", 2);
        Product secondProduct = new Product(4, "Orange", 5);
        Product thirdProduct = new Product(7, "Banana", 4);
        Product fourthProduct = new Product(10, "Lemon", 8);
        Product fifthProduct = new Product(12, "Kiwi", 3);


        shop.addProduct(firstProduct);
        shop.addProduct(secondProduct);
        shop.addProduct(thirdProduct);
        shop.addProduct(fourthProduct);
        shop.addProduct(fifthProduct);
        System.out.println("List of products:");
        System.out.println(shop.getAllProducts());

        List<Product> listSortPrice = new ArrayList<Product>();
        listSortPrice.addAll(shop.getAllProducts());
        System.out.println("Sort of products by price in ascending order:");
        Collections.sort(listSortPrice, new Comparator<Product>() {
            public int compare(Product person, Product t1) {
                return Integer.valueOf(person.getPrice()).compareTo(Integer.valueOf(t1.getPrice())
                );
            }
        });
        for (Product product : listSortPrice) {
            System.out.println(product.getPrice()+" - "+product.getName());
        }
         shop.removeProduct(7);
        System.out.println("Removing a product from the list under id 7 - Banana");

        ArrayDeque sortedData = new ArrayDeque<Product>();
        sortedData.addFirst(fourthProduct);
        sortedData.addFirst(fifthProduct);
        sortedData.add(secondProduct);
        sortedData.addLast(firstProduct);
        System.out.println(sortedData);

          shop.editProduct(new Product(12,"Kiwi",15));

        System.out.println("Product list after editing the Kiwi price before:");
        System.out.println(shop.getAllProducts());

        }
    }
