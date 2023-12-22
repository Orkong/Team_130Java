package day45_maps_The_End;

import java.util.HashMap;
import java.util.Map;

public class C02_MapMethodlari {

    public static void main(String[] args) {

        //Soru : Verilen bir array’de kullanilan harfleri ve kacar defa kullanildigini yazdirin.
        //
        //Input : {a,b,c,d,e,c,d,b,e,a,c,b,d,a}
        //output :  a kullanimi : 3 adet
        //	        b kullanimi : 3 adet
        //	        c kullanimi : 3 adet
        //      	d kullanimi : 3 adet
        //	        e kullanimi : 2 adet

        String []harfler= {"a","b","c","d","e","c","d","b","e","a","c","b","d","a"};

        // bir map olusturalim,key harfler value ise kullanim adedi olsun

        Map<String,Integer>harfKullanimMapi =new HashMap<>();


        for (String each : harfler
        ) {

            if (harfKullanimMapi.containsKey(each)){ // gelen harf map'de var
                int harfinEskiKullanimSayisi = harfKullanimMapi.get(each);
                harfKullanimMapi.put(each, harfinEskiKullanimSayisi+1);

            }else { // gelen harf map'de yok

                harfKullanimMapi.put(each,1); // map'de yoktu biz ekledik
            }
        }
        System.out.println(harfKullanimMapi);


    }
}
