package com.yarendonmez._13_polymorphismDemo;

public class CustomerManager {
    private BaseLogger logger;
    public CustomerManager(BaseLogger logger){
        this.logger = logger; // this.logger(private Baselogger logger daki) = logger (public CustomerManager(Baselogger logger)daki
    }

    public void add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("Log mesajı");




    }
}
