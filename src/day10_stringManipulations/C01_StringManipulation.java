package day10_stringManipulations;

import java.util.Locale;

public class C01_StringManipulation {
    public static void main(String[] args) {

        String str = "Java candir";

        // str buyuk harflerle yazdirin

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        // str kucuk harflerle yazdirin

        System.out.println(str.toLowerCase()); // java candir

        // String method'lari kullanildiginda orjinal metin degismez
        System.out.println(str);  // Java Candir

        // degisikligi kalici yapmak istersek, atama yapmaliyiz

        str = str.toUpperCase();

        System.out.println(str); //JAVA CANDIR


        // str'i kucuk harfe cevirin, ancak buyuk I harfi kucuk harfe
        // cevrildiginde ingilizce i olur


        System.out.println(str.toLowerCase()); // java candir

        // eger methin'de ingilizce'de olmayan bir harf varsa
        // Turke kucuk ı'ya cevirmek istersek
        // toLowerCase(Locale....) kullanilabilir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); //java candır



    }
}
