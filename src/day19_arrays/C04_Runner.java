package day19_arrays;

import java.util.Arrays;

public class C04_Runner {
    public static void main(String[] args) {

        int[]sayilar = {3,-5,4,6,-2,9,1};
        String [] isimler={"ali","veli","sait","leman","ali","sait","mehmet"};


        // sayilar array'inde ki tum sayilari 3 artirip kaydedin

        sayilar = C02_ArrayinElemanlariniArtirma.elemanlariArtir(sayilar,3);

        System.out.println(Arrays.toString(sayilar)); // [6, -2, 7, 9, 1, 12, 4]

        // sayilar array'inin yeni halinde pozitif elementlerinin toplamini yazdirin

        System.out.println("Pozitif elementlerin toplami : " +
                C03_PozitifSayilariToplama.pozitifElementleriTopla(sayilar));

        // Isimler array'inde mehmet ismi kac kere kullanilmis, yazdirin
        C04_KullanimAdediBulma.elemanArama(isimler,"mehmet"); //istenen eleman mehmet array'de 1kere kullanilmis


        // Isimler array'inde mehmet ismi kac kere kullanilmis, yazdirin
        C04_KullanimAdediBulma.elemanArama(isimler,"ali"); //istenen eleman ali array'de 2kere kullanilmis
    }

}
