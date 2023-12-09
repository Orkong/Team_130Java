package day15_MethodOlusturma;

import java.util.Scanner;

public class C04_PozitifTamBolenleriYazdir {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        //         Girilen sayinin pozitif tam bolenlerini yanyana yazdiran
        //         bir method olusturun.


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif tamsayi giriniz");
        int sayi=scan.nextInt();

        pozitifBolenleriYazdir(sayi);


        pozitifBolenleriYazdir(640);

        // pozitifBolenleriYazdir("Sanane");

        pozitifBolenleriYazdir('z');

        /*
            Method call'da kullanilan argument ile
            Method parametreleri uyumlu OLMALIDIR
            eger argument ve parametreler uyumlu olmazsa CTE olusur
            kod calismaz
         */


    }

    public static void pozitifBolenleriYazdir(int sayi){

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");

    }



}
