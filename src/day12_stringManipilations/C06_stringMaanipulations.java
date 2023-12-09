package day12_stringManipilations;

import java.util.Scanner;

public class C06_stringMaanipulations {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol
        //          edin ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //          eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre = scan.nextLine();

        int flag = 10;

        // ilk harf kucuk harf olmali
        char ilkHaf = sifre.charAt(0);
        if (!(ilkHaf >= 'a' && ilkHaf <= 'z')) {
            System.out.println("Ilk karakter kucuk harf olmali");
            flag++;
        }
        // son karakter rakam olmali
        char sonKarakter = sifre.charAt(sifre.length() - 1);

        if (!(sonKarakter >= '0' && sonKarakter <= '9')) {
            System.out.println("son karakter rakam olmali");
            flag++;
        }
        // sifre bosluk icermemeli
        if (sifre.contains(" ")) {
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }
        // uzunlugu en az 10 karakter olmali

        if (sifre.length() < 10) {
            System.out.println("uzunlugu en az 10 karakter olmali");
            flag++;

        }
        if (flag == 10) {
            System.out.println("sifre basariyla kaydedildi");
        }


    }
}
