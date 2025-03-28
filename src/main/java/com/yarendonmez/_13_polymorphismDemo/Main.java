package com.yarendonmez._13_polymorphismDemo;

import com.yarendonmez._13_1_overriding_polymorphism.BaseKrediManager;
import com.yarendonmez._13_1_overriding_polymorphism.OgrenciKrediManager;
import com.yarendonmez._13_1_overriding_polymorphism.OgretmenKrediManager;
import com.yarendonmez._13_1_overriding_polymorphism.TarimKrediManager;

public class Main {

    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]{
                new OgretmenKrediManager(),
                new TarimKrediManager(),
                new OgrenciKrediManager()
        };

        for (BaseKrediManager krediManager: krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }

//       

    }

}
