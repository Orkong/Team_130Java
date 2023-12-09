package day07_ifElseStatements;

import java.util.Scanner;

public class C03_NotYazdirma {
    public static void main(String[] args) {
        // kullanicidan 100 uzerinden notunu alin
        // negatif veya 100' den buyuk deger girerse "Gecersiz not,
        // 85 ile 100 arasinda ise "AA"
        // 65 buyuk ve 85'ten kucukse "BB
        // 50 buyuk ve 65'ten kucukse "CC
        // 50 den kucukse "DD kaldin" yazdirin

        /*
            if
            else if
            else if
            ....
            else

            seklinde yazilan bir kod icin

            -sonu else ile bittiginden,bir sonuc yazdirmama ihtilmali yoktur
            -else if ... ile butun if'ler birbirine baglandigindan ayni anda
             iki if body'sinin devreye girme ihtimali YOKTUR.
            -
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double girilenNot = scan.nextDouble();

        if (girilenNot < 0 || girilenNot > 100) {
            System.out.println("Gecersiz not");
        } else if (girilenNot >= 85) {
            System.out.println("AA");
        } else if (girilenNot >= 65) {
            System.out.println("BB");
        } else if (girilenNot >= 50) {
            System.out.println("CC");
        } else {
            System.out.println("DD ile kaldiniz");
        }
    }
}
