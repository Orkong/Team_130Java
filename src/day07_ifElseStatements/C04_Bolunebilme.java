package day07_ifElseStatements;

import java.util.Scanner;

public class C04_Bolunebilme {
    public static void main(String[] args) {

        // Kullanicidan pozitif bir tam sayi alin
        // 3 ile bolunebiliyorsa "3'un kati"
        // 5 ile bolunebiliyorsa "5'in kati"
        // hem 3 hemde 5 ile bolunebiliyorsa "super sayi" yazdirin

        /*
            - Eger sartlar birbiri ile ilgili ise en once
            en secici olani yazmaliyiz.
            - Eger ifade else ile bitmezse if else statements
            tum degerleri kapsamiyor demektir.yani bazi degerleri
            girdigimizde kod calisir ama hicbir sonuc uretmez.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scan.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("Super sayi");
        } else if (sayi % 3 == 0) {
            System.out.println("3'un kati");
        } else if (sayi % 5 == 0) {
            System.out.println("5'in kati");

        }
    }
}
