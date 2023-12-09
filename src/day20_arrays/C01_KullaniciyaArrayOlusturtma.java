package day20_arrays;

import day19_arrays.C02_ArrayinElemanlariniArtirma;

import java.net.BindException;
import java.util.Arrays;
import java.util.Scanner;

public class C01_KullaniciyaArrayOlusturtma {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan array’in boyutunu ve tamsayi elementlerini alip
        //        array’i olusturan ve bize donduren bir method olusturun.

       // System.out.println("Ilk array : " + Arrays.toString(arrayOlustur()));


        int[] benimArray = arrayOlustur();
        System.out.println("Benim array " + Arrays.toString(benimArray));

        //benim array'imde ki tum sayilari 4 artirin
        benimArray = C02_ArrayinElemanlariniArtirma.elemanlariArtir(benimArray, 4);

        System.out.println("Benim array " + Arrays.toString(benimArray));

    }

    public static int[] arrayOlustur() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array'e kac eleman koyacaginizi giriniz");
        int elemanSayisi = scan.nextInt();

        int[] arr = new int[elemanSayisi];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array'e etlemek icin bir tamsayi giriniz");
            arr[i] = scan.nextInt();

        }

        return arr;

    }
}
