package day02_dataTurleri_Scanner;

public class C03_IsimVermeKurallari {

    public static void main(String[] args) {

        int NOT = 23;
        int not = 54;
        int Not = 45;
        int noT = 65;


        // Variable isimleri case sensitive (buyuk-kucuk harf duyarlidir)


        System.out.println(NOT); // 23
        System.out.println(Not); // 45
        System.out.println(noT); // 65


        // camelCase

        int karneNotu = 65;
        String isminIlkHarfi = "A";


        //  String isminilkharfi = "k";
        /*
          Eger variable ismi birden fazla kelimeden olusuyorsa
          ilk harf kucuk sonraki kelimeler ise ilk harf buyuk
          diger harfler kucuk yazilir.

          Buna camelCase denir.

          farkli sekilde yazincada Java kabul eder
          ama tum yazilimcilar tarafindan ortak olarak belirlenen
          kullanim kurallarina uymak bizim tecrubemizi gosterir.
         */


    }
}
