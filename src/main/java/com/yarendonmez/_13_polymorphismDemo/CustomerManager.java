package com.yarendonmez._13_polymorphismDemo;

public class CustomerManager {
    private BaseLogger custLogger;
    public CustomerManager(BaseLogger logger){
        this.custLogger = logger; // this.logger(private Baselogger logger daki) = logger (public CustomerManager(Baselogger logger)daki
    }

    public void add(){
        System.out.println("Müşteri eklendi");
        this.custLogger.log("Log mesajı");




    }
}
