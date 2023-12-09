package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_IstenmeyenIsimleriSilme {

    public static void main(String[] args) {

        //Soru 3- Verilen String bir listede
        // istenmeyen harf iceren elementleri silip,
        // kalan kismini list olarak bize donduren bir method olusturun

        List<String > isimler=new ArrayList<>();
        isimler.add("Meltem");
        isimler.add("Ramazan");
        isimler.add("Sait");
        isimler.add("Kaan");
        isimler.add("Kamil");
        isimler.add("Eren");

        String istenmeyenHarf ="e";

        System.out.println(isimler); //[Meltem, Ramazan, Sait, Kaan, Kamil, Eren]

        List<String> silinmeyecekIsimlerListesi =new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {

            if (!isimler.get(i).contains(istenmeyenHarf)){
                silinmeyecekIsimlerListesi.add(isimler.get(i));
            }
        }

        isimler=silinmeyecekIsimlerListesi;

        System.out.println(isimler); //[Ramazan, Sait, Kaan, Kamil]

        // baska bir listeye atamadan direkt silme yapabilir miyiz?

        istenmeyenHarf ="a";

        for (int i = 0; i <isimler.size(); i++) {

            if (isimler.get(i).contains(istenmeyenHarf)){
                isimler.remove(isimler.get(i));
                i--; // isim silindigi icin kontrole bir oncekinden baslamasi icin //[]

            }

        }
        System.out.println(isimler);

    }
}
