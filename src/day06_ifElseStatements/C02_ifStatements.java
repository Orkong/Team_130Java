package day06_ifElseStatements;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {

        // kullanicidan 2 sayi alin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        // ilk sayi 2'den buyukse "buyuksun sayi1" yazdirin
        boolean sonuc =sayi1>sayi2 ;

        if (sonuc){
            System.out.println("buyuksun sayi1");
        }

        // ikinci sayi 0'dan buyukse "buyuksun sayi2" yazdiralim
        sonuc = sayi2>0 ;
        if (sonuc){
            System.out.println("buyuksun sayi2");
        }

        // iki sayinin toplami 100'den buyukse "ikinizde buyuksunuz" yazdirin
        sonuc=sayi1+sayi2>100;
        if (sonuc){
            System.out.println("ikinizde buyuksunuz");
        }



    }
}
