package day14_forLoop_NestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {


        // loop ile 1 2 3 4 yazdirin
        for (int i = 1; i <=4 ; i++) {
            System.out.print(i+ " ");
        }
        System.out.println("");

        // loop ile 2 4 6 8 yazdirin
        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i+ " ");
        }
        System.out.println("");


        // loop ile 3 6 9 12 yazdirin
        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i+ " ");
        }
        System.out.println("");

        System.out.println("==========");
        /*
            for loop kullanarak
            1 2 3 4
            2 4 6 8
            3 6 9 12
            yazdirin

            Eger yazdirmamiz istemem sekil dikdortgen biciminde ise
            ic ice iki loop olustururuz
            Disardaki loop satirlari kontrol eder( bu soruda 3 satir var)
            Icerdeki loop ise her satirdaki sutunlari kontrol eder(4 sutun var)

         */


        for (int i = 1; i <=3 ; i++) {  // satilari

            for (int j = 1; j <=4 ; j++) {  // satirdaki sutunlari

                System.out.print(i*j + " ");

            }
            System.out.println("");
        }



    }
}
