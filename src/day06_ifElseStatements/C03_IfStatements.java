package day06_ifElseStatements;

import java.util.Scanner;

public class C03_IfStatements {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir sayi isteyin,
        //        sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi1=scan.nextInt();

        if (sayi1 % 5==0){
            System.out.println("Sayi 5'in kati");
        }
    }
}
