package com.yarendonmez.classesWithAttribute;

public class ProductManager{
    public void Add(Product product){
        System.out.println("Ürün eklendi: "+ product.getName());
    }

    public void Info(Product product){
        System.out.println("Ürün Bilgileri:");
        System.out.println(product.getId());
        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getStockAmount());
        System.out.println(product.getPrice());
        System.out.println(product.getColour());
        System.out.println(product.getCode());
    }

}
