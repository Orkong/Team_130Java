package day18_scope_LocaleVariable;

public class C02_Scope_ClassVariables_StaticKeyword {

    /*
        static keyword bir nevi statu belirtir
        static unvanini alan varilable alan veya method'lar
        static olmayan class uyelerini kabul etmezler

        static uyeler ellerini kollarini sallayarak heryere gidebilirler
        ama kendi iclerine static olmayan uyeleri almazlar
     */

    /*
         Class level'daki variable'larda
         static olarak veya static keyword kullanmadan olusturulabilir
     */

    static  String s;
    static int a;
    boolean bl;
    char chr;

    public static void main(String[] args) {

        staticMethod1();
        // staticOlmayanMethod2
        // Cannot resolve symbol 'staticOlmayanMethod2'

        s="Java";
        a=20;
        // bl= true;
        // chr='a';



    }

    public static void staticMethod1(){


        // staticOlmayanMethod2
        s="Hava";
        a=30;

    }

    public void staticOlmayanMethod2(){
        staticMethod1();
        System.out.println(s);
        System.out.println(a);

        System.out.println(bl);
        System.out.println(chr);
    }

}
