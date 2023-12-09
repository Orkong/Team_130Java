package day29_immutableClasses;

import java.util.Scanner;

public class C01_PasByValueVariable {

    public static void main(String[] args) {

        // bir method yapip verilen sayinin karesini dondurun

        int sayi =11;

        getSquare(sayi);

        System.out.println(getSquare(sayi));

        // verilen sayinin kupunu dondurun bir method olusturun
        // main method'da kullanicidan bir deger alip
        // kupunu hesaplatalim ve yeni degeri kullanicidan
        // alinan deger olarak kaydedelim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int girilenSayi= scan.nextInt();

        girilenSayi=getCube(girilenSayi);


    }

    public static int getCube(int girilenSayi){

        return girilenSayi*girilenSayi*girilenSayi;
    }

    public static int getSquare(int a){

        return a*a;



    }


}
