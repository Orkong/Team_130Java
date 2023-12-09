package day12_stringManipilations;

import java.util.Scanner;

public class C07_stringManipulations {
    public static void main(String[] args) {

        // Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
        // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk,
        //    soyismi buyuk harflerle yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();

        System.out.println("Lutfen Soy isminizi giriniz");
        String soyIsim=scan.nextLine();

        if (isim.length()>soyIsim.length()){
            System.out.println(
                    isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase()
                    + " "+
                    soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).toLowerCase()
                    );
        }
        if (soyIsim.length()>isim.length()){
            System.out.println(
                    isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase()
                    + " " +
                    soyIsim.toUpperCase()
            );
        }

    }
}
