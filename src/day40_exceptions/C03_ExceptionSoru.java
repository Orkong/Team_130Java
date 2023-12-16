package day40_exceptions;

import java.util.Scanner;

public class C03_ExceptionSoru {

    public static void main(String[] args) {

        // Kullaniciya istedigi kadar sayi girmesini soyleyin
        // girdigi sayilardan pozitif olanalri toplayin
        // negatif sayi veya 0 girerse, toplamaya eklemeyin
        // toplama islemini bitirmek icin kullanici Q'ya basmalidir
        // kullanici Q'ya bastiginda
        // toplam kac pozitif sayi girdigini ve toplamlarinin
        // kac oldugunu yazdirin

        int toplananSayiAdedi = 0;
        int toplam = 0;
        int girilenSayi = 0;
        String girilenHarf="a"; // Q disinda herhangi bir deger atadim
        Scanner scan=new Scanner(System.in);


        while (!girilenHarf.equalsIgnoreCase("Q")){

            System.out.println("Lutfen toplanmak uzere pozitif tam sayilar giriniz, "+
                               "\nBitirmek icin Q'ya basin");

            try {
                girilenSayi=scan.nextInt();

                if (girilenSayi>0){
                    toplam+=girilenSayi;
                    toplananSayiAdedi++;
                }else {
                    System.out.println("Negatif sayilar veya 0 isleme dahil edilmez");
                }

            } catch (Exception e) {

                girilenHarf=scan.next();
                if (!girilenHarf.equalsIgnoreCase("q")){
                    System.out.println("Lutfen bir tamsayi yazin veya Q'ya basin");
                }

            }
        }
        System.out.println(toplananSayiAdedi + " adet pozitif girildi ve toplamlari : "+ toplam);

    }
}
