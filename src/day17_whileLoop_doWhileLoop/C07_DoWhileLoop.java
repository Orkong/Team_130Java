package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {


        /*
            While loop'ta parantez icinde kontrol edilen degiskene
            biz loop'tan once deger atiyoruz

            do while loop kullanildiginda
            loop body'sinin calismama ihtimali yok
            loop bdoy'si en az bir kere calisir
         */

        // Bir ogretmenden not ortalamasi bulmak icin notlari alin
        // ogretmen islemi bitirmek icin negatif bir sayi girmelidir
        // Ogretmen negatif sayi girdiginde
        // toplam kac not girdigini,
        // not ortalamasinin kac oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        double not = -5;
        double toplam = 0;
        int sayac = 0;

        /*
        while (not>=0){
            System.out.println("Ortalama hesaplamak icin notlari giriniz\nbitirmek icin negatif sayi girin");

            not=scan.nextDouble();

            if (not>=0){
                toplam+=not;
                sayac++;
            }
        }
        */

        do {
            System.out.println("Ortalama hesaplamak icin notlari giriniz\nbitirmek icin negatif sayi girin");

            not=scan.nextDouble();

            if (not>=0){
                toplam+=not;
                sayac++;
            }
        }while (not>=0);

        System.out.println("toplam girilen not sayisi : " + sayac +
                "\ngirilen notlarin ortalamasi : "+ toplam/sayac);



    }
}