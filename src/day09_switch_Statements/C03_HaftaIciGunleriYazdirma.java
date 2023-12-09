package day09_switch_Statements;

import java.util.Scanner;

public class C03_HaftaIciGunleriYazdirma {
    public static void main(String[] args) {

        // Kullanicidan gun ismini isteyin
        // girilen gunun hafta ici veya haftasonu
        // oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi = scan.next().toLowerCase();

        switch (gunIsmi) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gecerli bir gun giriniz");
        }
    }
}
