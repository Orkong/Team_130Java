package day24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C07_ArrayDuzenleme {

    public static void main(String[] args) {

        //Soru 3- Verilen String bir list’deki her bir elementi kontrol edip,
        // - Kelimenin uzunlugu cift sayi ise ilk yarisini
        // - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        // yeni bir listeye ekleyip yazdirin.

        List<String> isimler =new ArrayList<>();
        isimler.add("Kaan");
        isimler.add("Sedat");
        isimler.add("Asli");
        isimler.add("Yakup");
        isimler.add("Sait");
        isimler.add("Sabri");
        isimler.add("Ramazan");

        List<String> yeniList=new ArrayList<>();

        for (String each: isimler
             ) {
            if (each.length() % 2 == 0) { // Kelimenin uzunlugu cift ise

                yeniList.add(each.substring(0, each.length() / 2));


            } else {  // kelimenin uzunlugu tek ise

                yeniList.add(each.substring(each.length() / 2));
            }
        }
        System.out.println(yeniList); // [Ka, dat, As, kup, Sa, bri, azan]

    }
}
