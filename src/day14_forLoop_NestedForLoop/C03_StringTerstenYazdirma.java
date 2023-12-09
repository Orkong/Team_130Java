package day14_forLoop_NestedForLoop;

import java.util.Scanner;

public class C03_StringTerstenYazdirma {
    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin =scan.nextLine(); // Java Candir


        for (int i = metin.length()-1 ; i >=0 ; i--) {

            System.out.print(metin.charAt(i));
        }



    }


}
