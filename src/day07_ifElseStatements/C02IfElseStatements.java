package day07_ifElseStatements;

import java.util.Scanner;

public class C02IfElseStatements {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir harf isteyin,
        //         girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //         yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin");
        char karakter = scan.next().charAt(0);

        // 1.yontem
        if (Character.isLowerCase(karakter)) {
            System.out.println(Character.toUpperCase(karakter));
        } else {
            System.out.println(karakter);
        }

        // 2. yontem
        if (karakter >= 'a' && karakter <= 'z') {
            System.out.println((char) (karakter - 32));
        }else {
            System.out.println(karakter);
        }
    }
}
