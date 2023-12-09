package day15_MethodOlusturma;

import java.util.Scanner;

public class C01_KendiSubstringMethodumuz {
    public static void main(String[] args) {


        /* Verilen bir string ve baslangic ve bitis indecx'leri icin
          asagidaki gorevleri tamamlayin

          1- Baslangic index bitis index'ten buyukse hata yazdirin
          2- Baslangic ve/veya bitis index'i verilen string'in disinda ise hata yazdirin
          3- Index'ler sinirlar icerisinde ise baslangic index dahil bitis index haric olacak
             sekilde iki index arasindaki harfleri yazdirin
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin=scan.nextLine();

        System.out.println("Lutfen baslangic index giriniz");
        int baslangic=scan.nextInt();

        System.out.println("Lutfen bitis index giriniz");
        int bitis=scan.nextInt();

        if (baslangic>bitis){
            System.out.println("Baslangic index'i bitis index'inden kucuk olmali");
        } else if (baslangic>= metin.length() || bitis>=metin.length()) {
            System.out.println("Verilen index'ler metnin disinda");
        }else {
            for (int i = baslangic; i <bitis ; i++) {
                System.out.print(metin.charAt(i));
            }
        }
        System.out.println("");
        System.out.println(metin.substring(baslangic, bitis));


    }
}
