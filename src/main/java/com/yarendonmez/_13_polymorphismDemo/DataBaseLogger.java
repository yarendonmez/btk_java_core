package com.yarendonmez._13_polymorphismDemo;

public class DataBaseLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to database: "+message);
    }
}
