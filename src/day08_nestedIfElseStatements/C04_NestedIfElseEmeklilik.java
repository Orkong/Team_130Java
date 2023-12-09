package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseEmeklilik {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        //        “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E:Erkek, K:Kadin");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();


        // Ana degisken cinsiyet olsun

        if (cinsiyet=='K'){
            // Kadinlar
            if (yas>70 || yas<15){
                System.out.println("Bu yaslar icin emeklilik sorgumuz calismiyor");
            } else if (yas>=60) {
                System.out.println("Kadin emekli olabilirsin");
            }else {
                System.out.println("Kadin emekli olmak icin : " + (60-yas)+" sene daha calismalidir");
            }

        } else if (cinsiyet=='E') {
            // Erkekler
            if (yas>80 || yas<15){
                System.out.println("Bu yaslar icin emeklilik sorgumuz calismiyor");
            } else if (yas>=65) {
                System.out.println("Erkek emekli olabilirsin");
            }else {
                System.out.println("Erkek emekli olmak icin : " + (65-yas)+" sene daha calismalidir");
            }

        }else {
            System.out.println("Cinsiyet icin E veya K secmelisiniz");
        }


    }
}
