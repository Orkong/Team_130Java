package day16_methodOlusturma_methodOverloading;

import java.util.Scanner;

public class C04_metniTersineCevirme {
    public static void main(String[] args) {

        // Verilen bir metni tersine cevirip
        // bize donduren bir method olusturun

        // "Java ile kod yaz" cumlesini tersten cevirin

        System.out.println(metniTerseCevir("Java ile kod yaz"));

        // Kullanicidan bir kelime isteyip palindrome olup olmadigini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str=scan.nextLine();

        if (str.equalsIgnoreCase(metniTerseCevir(str))){
            System.out.println("Verilen metin Palindrome");
        }else {
            System.out.println("Verilen metin palindrome degil");
        }

    }

    public static String metniTerseCevir(String metin){

        String tersMetin ="";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin+=metin.substring(i,i+1);


        }
        return tersMetin;


    }


}
