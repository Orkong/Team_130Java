package day39_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_CokluTryCatch {

    public static void main(String[] args) {


            // kullanicidan 2 tamsayi isteyin
            // birinci sayiyi ikinci sayiya bolup
            // sonucun tam sayi kismini yazdirin

        /*
            Birden fazla risk varsa cozum olarak
            1- riskler ayri ayri try-catch icine alinabilir
            2- ic-ice try-catch kullanilabilir
            3- tek try birden fazla catch blogu olabilir
            4- tek try tum riskleri kapsayan bir catch blogu olabilir

         */

            Scanner scan=new Scanner(System.in);

            int sayi1 = 0;
            int sayi2 = 1;

            try {
                System.out.println("Lutfen bolunecek tamsayiyi girin");

                sayi1 = scan.nextInt();

                System.out.println("Lutfen bolecek tamsayiyi girinz");

                sayi2= scan.nextInt();

                System.out.println("ilk sayi / ikinci sayi = " + sayi1/sayi2);

            } catch (InputMismatchException e) {

                System.out.println("Tamsayi dedik");
            }


    }
}
