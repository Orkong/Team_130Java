package day09_switch_Statements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan ISTQB kisaltmasindaki harflerden anlamini ogrenmek
        //        istedigini alin ve girilen harfin karsiligini yazdirin.
        //        I : International S : Software T : Testing Q : Qualifications B: Board

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ogrenmek istediginiz harfi girin");
        char harf = scan.next().toUpperCase().charAt(0);

        if (harf == 'I') {
            System.out.println("International");
        } else if (harf == 'S') {
            System.out.println("Software");
        } else if (harf == 'T') {
            System.out.println("Testing");
        } else if (harf == 'Q') {
            System.out.println("Qualifications");
        } else if (harf == 'B') {
            System.out.println("Board");
        } else {
            System.out.println("Kisaltmada olan harflerden birini tercih edin");
        }


    }
}
