package day24_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenenHarfinOlduguIsimleriListeleme {

    public static void main(String[] args) {

        // verilen bir String array'de
        // istenen harfi iceren isimleri
        // bir liste olarak yazdirin

        String []isimler={"Derya","Ismail","Sedat","Tugba","Murat","Sahil"};

        String istenenHarf = "t";

        List<String>uygunIsimlerListesi =new ArrayList<>();

        for (int i = 0; i <isimler.length ; i++) {

            if (isimler[i].contains(istenenHarf)){
                uygunIsimlerListesi.add(isimler[i]);
            }

        }
        System.out.println("Istenen harfi iceren isimler :"+ uygunIsimlerListesi);
    }
}
