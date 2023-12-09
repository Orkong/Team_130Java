package day32_encasulation;

import day31_stringBuilder_accessModifer.C04_AccessModifier;

public class C01_ChildClass extends C04_AccessModifier {
    // extends keyword icinde bulundugumuz C01 class'ini
    // C04_AccessModifier class'inin child'i yapar

    public static void main(String[] args) {



        C04_AccessModifier obj=new C04_AccessModifier();
        // System.out.println(obj.strPrivate);  Sadece kendi class
        // System.out.println(obj.sayiDefault); Kendi package'i //diger adi package private'dir
        // System.out.println(obj.blProtected);
        obj.methodPublic();

        C01_ChildClass objChild=new C01_ChildClass();
        System.out.println(objChild.blProtected);
        objChild.blProtected=true;
    }
}
