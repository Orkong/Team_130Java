package day07_ifElseStatements;

import java.util.Scanner;

public class C05_BirimCevirme {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        // ve cevirmek istedigi birimi sorun, istedigi birim metre
        // veya santimetre ise cevirip yazdirin,
        // yoksa “istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen mesafeyi kilometre olarak giriniz");
        double mesafeKm=scan.nextDouble();

        System.out.println("Lutfen cevirmek istedgiiniz birimi giriniz");
        String birim= scan.next();

        if (birim.equalsIgnoreCase("metre")){
            System.out.println("Girilen mesafenin metre cinsinden degeri: "+ mesafeKm* 1000);
        } else if (birim.equalsIgnoreCase("santimetre")) {
            System.out.println("Girilen mesafenin santimetre cinsinden degeri: "+ mesafeKm* 10000);
        } else {
            System.out.println("Sadece metre ve santimetreye cevirebilirsin, \nIstediginiz birim sistemde kayitli degil");
        }


    }
}
