package day12_stringManipilations;

import java.util.Scanner;

public class C08_stringManipulations {
    public static void main(String[] args) {

        // Soru 6 : Kullanicidan alinan bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        // String’in uzunlugu tek sayi ise ortadaki harfi silin ve
        // yerine :( yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scan.nextLine();


        if (metin.length() % 2 == 0) { // metnin uzunlugu ciftse

            metin = metin.substring(0, metin.length() / 2)
                    + ":)" +
                    metin.substring(metin.length() / 2);

        } else { // uzunluk tekse
            metin = metin.substring(0, metin.length() / 2)
                    + ":(" +
                    metin.substring((metin.length() /2+1 ));


        }
        System.out.println(metin);
    }
}
