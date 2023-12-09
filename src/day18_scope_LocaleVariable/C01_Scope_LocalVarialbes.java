package day18_scope_LocaleVariable;

public class C01_Scope_LocalVarialbes {

    public static void main(String[] args) {

        // Kural 1- Bir method icerisinde olusturulan variable'lara
        //          local variable denir.
        //          local variabl'lar sadece olusturulduklari method'da kullanilabilir
        //          diger method'larda KULLANILAMAZ

        String str="Java Candir";

        int a;
        boolean bl;
        char c;


        // System.out.println(a);

        // a++;

        bl=true;
        c='a';

        // Kural 2- local variabl'lar deger atanmadan olusturulabilir
        //          Amma deger atanmanadan kullanilamazlar

        for (int i = 0; i <10 ; i++) {

            System.out.print(i); //0123456789
            String s="Java";


        }

        // System.out.println(s); //
        // System.out.println(i); //

        // Kural 3- Her ne kadar bir method'un icinde olsada
        //          looplarda ayri bir local alandir
        //          loop icerisinde olusturulan variable'lar
        //          loop disinda KULLANILAMAZ




    }

    public static void method1(){





    }

}
