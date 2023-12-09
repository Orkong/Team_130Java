package day14_forLoop_NestedForLoop;

import java.util.Scanner;

public class C05_AsalSayi {
    public static void main(String[] args) {

        // Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        // sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen pozitif tamsayi giriniz");
        int sayi=scan.nextInt();


        int flag= 10;

        for (int i = 2; i <sayi-1 ; i++) {

            if (sayi % i ==0){
                flag++;
            }
        }

        if (flag ==10){
            System.out.println("Girilen sayi asal");
        }else {
            System.out.println("Girilen sayi asal degil");
        }


    }
}
