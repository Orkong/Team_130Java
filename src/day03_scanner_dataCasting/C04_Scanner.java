package day03_scanner_dataCasting;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //Soru 8 (Interview)- Kullanicidan iki sayi alip, ucuncu bir degisken kullanmadan ikisinin
        //                    degerlerini degistirin(swap)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz");    // 3
        int ilkSayi =scanner.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz"); // 5
        int ikinciSayi =scanner.nextInt();

        ilkSayi = ilkSayi + ikinciSayi;
        ikinciSayi = ilkSayi - ikinciSayi;
        ilkSayi = ilkSayi - ikinciSayi;


        System.out.println("Ilk sayi  : " + ilkSayi);
        System.out.println("Ikinci sayi   : " + ikinciSayi);


    }
}
