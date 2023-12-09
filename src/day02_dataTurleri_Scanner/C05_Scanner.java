package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir double,
        //         bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int  girilenTamSayi = scanner.nextInt();

        System.out.println("Ondalikli bir sayi yaziniz");

        double girilenOndalikliSayi = scanner.nextDouble();

        System.out.println("Toplam : " +(girilenTamSayi+girilenOndalikliSayi));
        System.out.println("Carpimi : " +(girilenTamSayi*girilenOndalikliSayi));
    }
}
