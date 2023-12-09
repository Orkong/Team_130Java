package day18_scope_LocaleVariable;

public class C03_Scope_ClassVariableKullanim {

    /*
        Kural 4- Static variable'lar her yere gidebilirler
                 static olmayan variable (instance variable)'lar ise
                 static alanlara giremezler

        Kural 5- Class level variabla'lar deger atanmadan olusturabildigi gibi
                 deger atanmadan kullanabilirler
                 biz deger atamazsak, java default deger olarak
                 - non primitive'lere ==> null
                 - sayisal primitive'lere ==> 0
                 - boolean variable'lara ==> false
                 - char variable' lara ==> hiclik degeri atar
     */

    static  String s;
    static int a;
    boolean bl;
    char chr;

    public static void main(String[] args) {

        System.out.println(s); // null

        System.out.println(a); // 0

        // Eger static olmayan class uyelerine static alandan ulasmak istersek
        // once class'tan bir obje olusturmali
        // sonra o obje uzerinden static olmayan uyeler kullanilmalidir

        C03_Scope_ClassVariableKullanim obj=new C03_Scope_ClassVariableKullanim();

        System.out.println(obj.bl); // false
        System.out.println(obj.chr);// ''


    }

    public static void method1(){
        System.out.println("static method caslisti");

    }

    public void method2(){

        System.out.println("static olmayan method caslisti");


    }

}
