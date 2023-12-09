package day11_stringManipulation;

public class C02_LastIndexOf {
    public static void main(String[] args) {

        String str = "Bu Java ogrenilecek";
        // e'nin ilk kullaniminin index'ini yazdirin

        System.out.println(str.indexOf("e")); // 11
        // e'nin son kullaniminin index'ini yazdirin

        System.out.println(str.lastIndexOf("e")); // 17
        // u'nin ilk kullanim ve son kullanim index'lerini yazdirin

        System.out.println("ilk index : " + str.indexOf("u"));
        System.out.println("son index : " + str.lastIndexOf("u"));

        // J harfinin bu metin'de hic kullanilmadigini veya sadece 1 kere kullanildigini yazdirin

        if (str.indexOf('J') == -1){
            System.out.println("Metin J yok");
        }else if (str.indexOf('J') == str.lastIndexOf("J")) {
            System.out.println("Metinde J sadece 1 kere kullanilmis");
        }

        // Bu java ogrenilecek
        System.out.println(str.lastIndexOf("e", 15)); // 15
        System.out.println(str.lastIndexOf("e", 14)); // 11

        System.out.println(str.lastIndexOf("x")); // -1

    }
}
