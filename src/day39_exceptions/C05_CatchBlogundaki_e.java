package day39_exceptions;

import java.util.Scanner;

public class C05_CatchBlogundaki_e {

    public static void main(String[] args) {

        // Kullanicidan bir cumle ve bir sayi isteyin
        // kullanicinin verdigi sayiyi index olarak kabul edip
        // cumlede o index'deki karakteri yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine();

        System.out.println("Lutfen bir tamsayi giriniz");
        int index = scan.nextInt();

        try {
            System.out.println(cumle.charAt(index));

        } catch (StringIndexOutOfBoundsException e) {

            // System.out.println(e);
            // java.lang.StringIndexOutOfBoundsException: String index out of range: 10

            // System.out.println(e.getCause()); // null

            // System.out.println(e.getMessage()); //String index out of range: 9

            e.printStackTrace(); // exception olsutunda yazdirilan tum satilari yazdirir
                                 // ama exception kontrol altina alindigi icin
                                 // kod NORMAL olarak biter

            System.out.println("Girilen index cumlenin sinirlari disinda");
        }


    }
}
