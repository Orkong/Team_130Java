package day23_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_OrtalamaUstundekiOgrenciler {

    public static void main(String[] args) {

        // bir ogretmenden ogrenci ismini ve notunu isteyin
        // Ogretmen Q'ya bastiginda islemi bitirip
        // ortalama uzerinde not alan ogrencilerin isimlerini List olarak yazdirin

        // Ipucu: isimleri ve notlari ayri 2 liste olarak tutun

        Scanner scan=new Scanner(System.in);
        List<String> isimlerListesi=new ArrayList<>();
        List<Double> notlarListesi=new ArrayList<>();
        double girilenNot=0;
        double notToplami=0;
        String girilenIsim="";

        while (!girilenIsim.toUpperCase().equals("Q")){

            System.out.println("Lutfen ogrenci ismini girin");
            girilenIsim=scan.nextLine();

            if (!girilenIsim.toUpperCase().equals("Q")){

                isimlerListesi.add(girilenIsim);


                System.out.println("Lutfen ogrenci notunu giriniz");
                girilenNot=scan.nextDouble();
                scan=new Scanner(System.in);
                notToplami+=girilenNot;
                notlarListesi.add(girilenNot);
            }
        }

        double ortalama=notToplami/notlarListesi.size();

        // elimizde notlarListesi ve isimlerListesi var
        // ayni index'deki isim ve not ilintili
        // notlarListesindeki notlari gozden gecirip
        // ortalamanin ustunde olanlari
        // once ismini yanina notunu yazdirin

        System.out.println("Ortalama not : "+ ortalama);
        System.out.println("Ortalamanin ustunde not alan ogrenciler");

        for (int i = 0; i < isimlerListesi.size() ; i++) {

            if (notlarListesi.get(i)>=ortalama){

                System.out.println(
                        isimlerListesi.get(i)
                        +" "+
                                notlarListesi.get(i)
                );
            }

        }


    }
}
