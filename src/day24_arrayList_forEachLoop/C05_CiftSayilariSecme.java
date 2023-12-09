package day24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_CiftSayilariSecme {

    public static void main(String[] args) {

        // Verilen int bir array'den cift sayilari alip
        // ayri bir array olarak kaydedin
        int[] arr = {3, 5, 1, 7, 0, 4, 2, 6, 7, 8, 1, 5, 8, 7, 6};

        /*
             istenen elementleri bir array olarak istedigi icin
             iki sekilde yapabiliriz

             1- once kac tane cift sayi oldugunu bulur
             sayiya gore bir array olusturup
             cift sayilari olsuturulan yeni array'e kopyalariz

             2- array'deki tum elementleri gozden gecirip
             cift olanlari bir listeye atariz
             listenin uzunluguna gore yeni array olusturup
             listedeki elementleri yeni array'e kopyalariz
        */

        List<Integer> ciftSayilarListesi = new ArrayList<>();

        for (Integer each : arr
        ) {
            if (each % 2 == 0) {
                ciftSayilarListesi.add(each);
            }
        }// [0, 4, 2, 6, 8, 8, 6]

        int[]ciftSayilarArrayi=new int[ciftSayilarListesi.size()];

        /*
        Mantikli olan yontem for loop ile elementleri
        ciftSAyilarArray'ine kopyalamaktir
        for (int i = 0; i <ciftSayilarArrayi.length ; i++) {

            ciftSayilarArrayi[i]=ciftSayilarListesi.get(i);
            // Cift sayilar Array : [0, 4, 2, 6, 8, 8, 6]
        }
        */

        // For-each loop yapmak sitersek
        int index=0;
        for (int each :ciftSayilarListesi
             ) {
            ciftSayilarArrayi[index]=ciftSayilarListesi.get(index);
            index++;
        } // Cift sayilar Array : [0, 4, 2, 6, 8, 8, 6]

        System.out.println("Cift sayilar Array : "+ Arrays.toString(ciftSayilarArrayi));

    }
}
