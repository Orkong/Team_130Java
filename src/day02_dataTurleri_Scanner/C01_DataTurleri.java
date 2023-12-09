package day02_dataTurleri_Scanner;

public class C01_DataTurleri {

    public static void main(String[] args) {

        int sayi = 23 ;    // Hafizada 32 bit kullanir

        byte sayi1 = 23;   // Hafizada 8 bit kullanir

        short sayi2 = 23;  // Hafizada 16 bit kullanir

        long sayi3 = 23;   // Hafizada 64 bit kullanir

        char ch1 = '4';
        char ch2 = ' '; // space de #, % gibi bir karakterdir

        String str1 ="Java Candir";
        String telefonNo = "5555555555";


        System.out.println("str1"); // str1
        System.out.println(str1);  // Java Candir

        int x = 23;
        int y = 13;

        // iki sayinin toplamini yazdirin

        System.out.println(x+y);  // 36
        System.out.println("X ve Y nin toplami : " + (x+y));
        // X ve Y nin toplami : 36


        x = 15;

        System.out.println("x  : " + x); // x : 15

        x = 3 * x + 1 ;

        System.out.println("X in yeni degeri :" + x); // x' in yeni degeri : 46

        float fl1 = 20f;
        float fl2 = 6f;

        System.out.println(fl1 / fl2); //  3.3333333

        double dbl1 = 20 ;
        double dbl2 = 5 ;

        System.out.println(dbl1 / dbl2); // 3.3333333333333335




    }
}
