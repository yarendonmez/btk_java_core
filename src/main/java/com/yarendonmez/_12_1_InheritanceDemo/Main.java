package com.yarendonmez._12_1_InheritanceDemo;

public class Main {
    public static void main(String[] args) {
        KrediUI krediUI = new KrediUI();

        krediUI.KrediHesapla(new OgretmenKrediManager());
        krediUI.KrediHesapla(new AskerKrediManager());


    }
}
