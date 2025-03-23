package com.yarendonmez._10_getter_setter;

public class Main {
    public static void main(String[] args) {
        //Product product1 = new Product(1,"Laptop","Asus",25000.758,52,18);
        Product product1 = new Product();
        Product product2 = new Product(3281,"Masaüstü Pc","Lenovo",89745,1,21);

        product1.setId(22314);
        product1.setName("Laptop");
        product1.setDescription("Asus");
        product1.setPrice(25000.758);
        product1.setStockAmount(52);
        product1.setColour("red");



        ProductManager productManager = new ProductManager();
        productManager.Add(product1);
        System.out.println();
        productManager.Info(product1);

        System.out.println("-----------");
        productManager.Add(product2);
        productManager.Info(product2);


    }
}
