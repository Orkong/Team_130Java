package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //        girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");
        char isimIlkHarf = scanner.nextLine().charAt(0);

        System.out.println("Lutfen soyismini giriniz");
        String soyIsim = scanner.nextLine();

        System.out.println("Lutfen yazsinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("girilen bilgiler : "+ isimIlkHarf + " " + soyIsim+ ", "+ yas);

    }
}
