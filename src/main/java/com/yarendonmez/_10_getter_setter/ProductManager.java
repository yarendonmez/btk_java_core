package com.yarendonmez._10_getter_setter;

public class ProductManager{
    public void Add(Product product){
        System.out.println("Ürün eklendi: "+ product.getName());
    }

    public void Info(Product product){
        System.out.println("Ürün Bilgileri:");
        System.out.println("ID: "+product.getId());
        System.out.println("Name: "+product.getName());
        System.out.println("Description:"+product.getDescription());
        System.out.println("Stok Amount: "+product.getStockAmount());
        System.out.println("Price: "+product.getPrice());
        System.out.println("Colour: "+product.getColour());
        System.out.println("Code: "+product.getCode());
    }

}
