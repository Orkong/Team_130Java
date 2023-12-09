package day10_stringManipulations;

import java.util.Scanner;

public class C02_equals {
    public static void main(String[] args) {

        String str1 = "Ahmet";
        String str2 = "AHMET";
        String str3 = "ahmet";
        String str4 = "AhMet";
        String str5 = "Ahmet";
        String str6 = new String("Ahmet");
        String str7 = "Ah";
        String str8 = "met";
        String str9 = str7 + str8;

        Scanner scan = new Scanner(System.in);

        // 1- String case sensitive'dir. str1, str2, str3 ve str4'un degerleri birbirinden farklidir.
        //    str1, str5, str6 ve str9' un degerleri aynidir.
        //    String'de karsilastirma icin == kullanirsaniz metni ayni olan
        //    string'lerde bile false donebilir
        //    == hem metin degerine hem de referansa baktigi icin metni ayni olan farkli
        //    stringler icin farkli sonuclar verebilir

        System.out.println(str1 == str5); // true
        System.out.println(str1 == str6); // false
        System.out.println(str1 == "Ahmet"); // true
        System.out.println(str1 == str9); // false

        // Iki String'in Metin olarak ayni olup olmadigini kontrol etmek icin
        // SIMDILIK == kullanmayacagiz
        // Stringlerde metin olarak ayni olmayi kontrol etmek icin
        // equals() kullanili

        // equals() ayni metinler icin true doner
        System.out.println(str1.equals(str5));   // true
        System.out.println(str1.equals(str6));   // true
        System.out.println(str1.equals("Ahmet"));// true
        System.out.println(str1.equals(str9));   // true

        // equals () ayni metnin farkli yazimlari icin false sonucunu verir
        System.out.println(str1.equals(str2));   // false
        System.out.println(str1.equals(str3));   // false
        System.out.println(str1.equals(str4));   // false

        // EGER buyuk-kucuk harf farkli yazimlari da esit kaubl edelim derseniz
        System.out.println(str1.equalsIgnoreCase(str2));   // true
        System.out.println(str1.equalsIgnoreCase(str3));   // true
        System.out.println(str1.equalsIgnoreCase(str4));   // true




    }
}
