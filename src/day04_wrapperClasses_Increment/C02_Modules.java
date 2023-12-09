package day04_wrapperClasses_Increment;

import java.util.Scanner;

public class C02_Modules {

    public static void main(String[] args) {

        System.out.println( 25 % 8); // 1

        System.out.println(25 / 8);

        // 342352352 sayisinin 8 ile bolumunden kalan kactir?

        System.out.println(342352352 % 8); // 0

        // 24234321 sayisi 113'e tam bolunur mu?

        System.out.println(24234321  % 113); // 2 tam bolunmez

        // 34567384 sayisi 3'e tam bolunur mu?

        System.out.println(34567384 % 3); // 1 tam bolunmez

        // kullanicidan bir sayi isteyip birler basamagini yazdirin

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int sayi= scanner.nextInt();

        System.out.println("Girilen sayinin birler basamagi :"+ (sayi % 10));

        // 375

        System.out.println(375 % 10); // 5 birler basamagini veriyor
        System.out.println(375 / 10); // 37 birler basamagi haric kalan sayiyi veriyor

        System.out.println(37 % 10); // 7
        System.out.println(37 / 10); // 3

        System.out.println(3 % 10);  // 3
        System.out.println(3 / 10);  // 0

    }
}
