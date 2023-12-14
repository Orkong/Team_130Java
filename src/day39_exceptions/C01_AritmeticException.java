package day39_exceptions;

import java.util.Scanner;

public class C01_AritmeticException {

    public static void main(String[] args) {
        // kullanicidan 2 tamsayi isteyin
        // birinci sayiyi ikinci sayiya bolup
        // sonucun tam sayi kismini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bolunecek tamsayiyi girin");
        int sayi1 = scan.nextInt();

        System.out.println("Lutfen bolecek tamsayiyi girinz");
        int sayi2= scan.nextInt();

        if (sayi2 == 0){
            System.out.println("Bolecek sayi 0 olamaz");
        }else {
            System.out.println("ilk sayi / ikinci sayi = " + sayi1/sayi2);
        }

        System.out.println("ilk sayi / ikinci sayi = " + sayi1/sayi2);
    }
}
