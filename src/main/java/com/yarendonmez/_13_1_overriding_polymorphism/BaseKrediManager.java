package com.yarendonmez._13_1_overriding_polymorphism;

public class BaseKrediManager {

    //public final double hesapla(double tutar) dersem override edilemez.
    public double hesapla(double tutar){
        double faizOrani = 1.18;
        return tutar * faizOrani;
    }
}
