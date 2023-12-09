package day14_forLoop_NestedForLoop;

import java.util.Scanner;

public class C02_FizzBuzz {
    public static void main(String[] args) {

        //Soru 8 (interview)- Kullanicidan pozitif bir sayi alin,
        // 1’den baslayarak verilen sayiya kadar  tamsayilari yazdirin, sira
        // - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        // - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        // - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ppzitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i < sayi; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz ");
            } else {
                System.out.print(i + " ");
            }

        }

    }
}
