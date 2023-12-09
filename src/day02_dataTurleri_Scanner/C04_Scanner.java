package day02_dataTurleri_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        // kullanicidan ismini alip
        // buyuk harf olarak yazdirin

        // 1. adim Scanner objesi olustur

        Scanner scanner = new Scanner(System.in);

        // 2. adim kullanicidan istediginiz bilgiyi
        //         kullaniciya bilgi olarak konsolda yazdirin

        System.out.println("Lutfen isminizi giriniz");

        // 3. adim istediginiz bilgiye uygun bir variable olusturun
        //         Scanner objesi ve uygun next() methodu ile bilgiyi kullanicidan
        //         alip olusturdugunuz variable atayin

        String girilenIsim = scanner.nextLine();


        System.out.println(girilenIsim.toUpperCase());



    }
}
