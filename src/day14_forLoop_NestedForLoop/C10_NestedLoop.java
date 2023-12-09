package day14_forLoop_NestedForLoop;

import java.util.Scanner;

public class C10_NestedLoop {
    public static void main(String[] args) {

        /*
            Kullanicidan satir sayisini alip
            asagidaki sekli cizdirin

            *
            * *
            * * *
            * * * *
            * * * * *
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir = scan.nextInt();


        for (int i = 1; i <=satir; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
            }
            System.out.println("");

        }




    }
}
