package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan baslangic ve bitis degerlerini alin
        // baslangic ve bitis dahil olarak
        // bu iki sayi arasindaki tum sayilari toplayin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerleri olarak iki tam sayi giriniz");
        int baslangic= scan.nextInt();
        int bitis=scan.nextInt();

        // while loop ile yapalim

        int sayi=baslangic;
        int toplam=0;


        while (sayi<=bitis){
            toplam+=sayi;
            sayi++;

        }

        System.out.println("toplam : "+toplam);
    }
}
