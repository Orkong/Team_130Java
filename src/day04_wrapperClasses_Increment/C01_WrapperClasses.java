package day04_wrapperClasses_Increment;

public class C01_WrapperClasses {

    public static void main(String[] args) {

        int sayi = 10;

        String str = "Java Candir";


        // Java primitive data turleri icinde istedigimizde method
        // kullanabilmemize imkan vermek amaciyla Wrapper class' lari olursuturmustur.
        // Boolean, Character, Byte, Short, Integer, Long, Float, Double

        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println(Double.MAX_VALUE); // 1.7976931348623157E308

        String sayi1 = "103";
        String sayi2 = "204";

        System.out.println(sayi1+sayi2); // 103204

        int sayi1inDegeri = Integer.parseInt(sayi1);
        int sayin2inDegeri = Integer.valueOf(sayi2);


        System.out.println("String olarak verilen iki sayinin toplami :"+(sayi1inDegeri+sayin2inDegeri));


        System.out.println(Integer.max(34, 45));

        char chr1 = '7';
        char chr2 = 'r';
        char chr3 = '#';

        System.out.println(Character.isLetter(chr1)); // false
        System.out.println(Character.isLetter(chr2)); // true

        System.out.println(Character.isAlphabetic(chr3)); // false

        // chr2' nin degerini buyuk harf yapin

        System.out.println(Character.toUpperCase(chr2)); // R



    }
}
