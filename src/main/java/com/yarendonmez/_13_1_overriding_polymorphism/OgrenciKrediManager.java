package com.yarendonmez._13_1_overriding_polymorphism;

public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        double faizOrani = 1.10;
        return tutar * faizOrani;
    }
}
