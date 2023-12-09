package day32_encasulation;

import day31_stringBuilder_accessModifer.C04_AccessModifier;

public class C02_ChildOlmayanClass {

    public static void main(String[] args) {

        C04_AccessModifier obj=new C04_AccessModifier();
        // System.out.println(obj.strPrivate); Sadece ayni class'dakiler olusur
        // System.out.println(obj.sayiDefault);Sadece ayni package'dakiler
        // System.out.println(obj.blProtected); child class'lar
        obj.methodPublic();

    }
}
