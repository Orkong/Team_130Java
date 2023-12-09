package day06_ifElseStatements;

import java.util.Scanner;

public class C01_ifStatements {
    public static void main(String[] args) {

        /*
            Bagimsiz if cumleleri
            kodun geriye kalanlariyla ilgilenmez
            SADECE if parantezindeki boolean sarta odaklanir
            boolean sart ==> true ise if bodysi calisir
            boolean sart ==> false ise if bodysi calismaz

            birden fazla bagimsiz if cumlesi kullanildiginda girilen
            degere bagli olarak tum if body'leri devreye girebilecegi gibi
            hicbir if body'si devreye girmeyebilir de.
         */

        // kullanicidan 2tamsayi alin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 2 tam sayi giriniz");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        // 1. sayi, 2.sayidan buyukse aferin yazdirin

        if (sayi1 > sayi2) {
            System.out.println("Aferin");
        }

        // 1.sayi cift ise cift sayilari severim yazdirin

        if (sayi1 % 2 == 0) {
            System.out.println("Cift sayilari severim");
        }

        // 2.sayi 50'den buyukse buyuk sayilarla isim olmaz yazdirin

        if (sayi2 > 50) {
            System.out.println("Buyuk sayilarla isim olmaz");
        }

        // toplamlari 100'den kucukse ufak sayilarla isim olamz yazdirin

        if (sayi1 + sayi2 < 100) {
            System.out.println("Kucuk sayilarla isim olmaz");
        }

    }
}
