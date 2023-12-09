package day12_stringManipilations;

import java.util.Scanner;

public class C09_stringManipulations {
    public static void main(String[] args) {

        // kullanicidan isim, soyisim ve kredi karti numarasini alin
        // gorunurIsim olarak A****** N****** seklinde
        // sadece ilk harfler buyuk harf olarak gorunsun, diger harfler * olsun
        // gorunur kart no : **** **** **** 1234 olsun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lutfen soy isminizi giriniz");
        String soyIsim=scan.nextLine();
        System.out.println("Lutfen kredi karti numarasini giriniz");
        String kkNo=scan.nextLine();

        String gorunurIsim=isim.substring(0,1).toUpperCase()
                          +isim.substring(1).replaceAll("\\w","*")
                          + " "
                          +soyIsim.substring(0,1).toUpperCase()
                          +soyIsim.substring(1).replaceAll("\\S", "*");

        String gorunurKartNo = " ***** **** **** "+kkNo.substring(kkNo.length()-4);

        System.out.println(gorunurIsim);
        System.out.println(gorunurKartNo);
    }
}
