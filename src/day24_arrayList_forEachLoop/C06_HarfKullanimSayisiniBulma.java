package day24_arrayList_forEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class C06_HarfKullanimSayisiniBulma {

    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //         case sensitive olmadan
        //         harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //         kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();

        System.out.println("aranacak harf girin");
        String harf =scan.next().substring(0,1);

        /*
            cumledeki herbir harfe iki turlu ulasabilir
            1- for-loop ve substring ile
            2- split ile array'e cevirip, for-each loop ile
         */

        String[] cumleHarfArrayi = cumle.split("");

        int sayac=0;
        for (String each: cumleHarfArrayi
             ) {

            if (each.equalsIgnoreCase(harf)){
                sayac++;

            }
        }

        if (sayac==0 ){
            System.out.println("harf cumlede kullanilmamis");
        }else {
            System.out.println("Harf cumlede : " + sayac + " defa kullanilmis");
        }

    }
}
