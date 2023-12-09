package day06_ifElseStatements;

import java.util.Scanner;

public class C08_IfElseSusluParantezKullanimi {

    public static void main(String[] args) {

        // Kullanicidan 2 tam sayi alin
        // eger sayi1 , sayi2'de buyukse  sayi1'i 1 azaltip,
        // sayi1, sayi2 den buyuk degilse sayi1'i 3 ile carpin sayi2'yi 2 ile carpin
        // sayi1 ve sayi2 nin son degerlerini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        /*
            eger if ve else'den sonra suslu parantez kullanmazsak
            Java if body ve else body olarak ilk noktali virgule kadar olan
            kismi alir

            Eger if ve else bodyleri tek bir satirdan olusuyorsa susulu parantez kullanmazsakta olur
            AMA if bodysi ve else bodysinde bir satirdan fazla bir kod varsa
            MUTLAKA {} kullanmaliyiz.
         */

        if (sayi1 > sayi2)
            sayi1--;

         else
            sayi1 *= 3;
            sayi2 *= 2;

        System.out.println("Sayi1 :" + sayi1 + ", Sayi2 :" + sayi2);
    }
}
