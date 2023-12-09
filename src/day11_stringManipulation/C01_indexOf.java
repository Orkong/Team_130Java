package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {


        String str = "Java cok guzel bir programlama dili";

        System.out.println(str.contains("a"));  // true

        System.out.println(str.indexOf("a")); // 1

        System.out.println(str.indexOf('c')); // 5

        System.out.println(str.charAt(5));    // c

        System.out.println(str.indexOf("a ")); // 3

        System.out.println(str.indexOf("guzel")); //9

        System.out.println(str.indexOf(" ")); // 4

        System.out.println(str.indexOf(" ", 10)); //14

        // ikinci space'in index'ini yazdirin

        System.out.println(str.indexOf(" ", 5)); // 4

        // ikinci i'nin index'ini yazdirin

        System.out.println(str.indexOf("i")); // 16

        System.out.println(str.indexOf("i", str.indexOf("i") + 1)); //32

        // ikinci a'nin indexini yazdirin

        System.out.println(str.indexOf("a", str.indexOf("a") + 1));// 3

        // Olmayan bir String'in Indexini istersek

        System.out.println(str.indexOf("x")); //-1
        System.out.println(str.indexOf("Phyton")); //-1

        // ikinci c olup olmadigini yazdirin
        int ilkCIndex = str.indexOf("c");

        if (ilkCIndex == -1) {
            System.out.println("verilen metin'de c yok");
        } else if (str.indexOf("c", ilkCIndex + 1) == -1) {
            System.out.println("2.c yok");
        } else {
            System.out.println("2.c var");
        }

    }
}
