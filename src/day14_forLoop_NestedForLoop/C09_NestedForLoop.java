package day14_forLoop_NestedForLoop;

import java.util.Scanner;

public class C09_NestedForLoop {
    public static void main(String[] args) {

        /*
            Kullanicidan satir sayisini alip
            asagidaki sekli cizdirin

            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir = scan.nextInt();

        for (int i = 1; i <=satir; i++) { // satir

            for (int j = 1; j <=i ; j++) { // sutun

                System.out.print(j+" ");
            }
            System.out.println("");
        }

    }
}
