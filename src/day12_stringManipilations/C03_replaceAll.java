package day12_stringManipilations;

import java.util.Scanner;

public class C03_replaceAll {

    public static void main(String[] args) {


        // Kullanicidan bir metin isteyin kullanicinin girdigi metinden space disindaki
        // tum karakterleri ve sayilari silip, metni yeni haliyle yazdirin

        // input: "J1*a34_va+12 C87an.90d654ir,";


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin=scan.nextLine();

        // once sayilardan kurtulalim
        metin =metin.replaceAll("\\d", ""); // J*a_va+ Can.dir,

        // space koruma altina almak icin herhangi bir rakamla replace yapalim
         metin= metin.replaceAll("\\s","5"); //J*a_va+5Can.dir,

        //ozel karakterelerdon kurtulalim
        metin=metin.replaceAll("\\W",""); // Ja_va5Candir

        // _'yi yok edelim sayi koydugumuz space geri getireleim
        metin=metin.replace("_","").replaceAll("5"," ");

        System.out.println(metin);




    }
}
