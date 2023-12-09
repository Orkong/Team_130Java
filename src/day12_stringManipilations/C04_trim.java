package day12_stringManipilations;

public class C04_trim {
    public static void main(String[] args) {

        String str ="    Ali    topa     vur.     ";
        // metindeki fazla kullanilan spaceleri temizleyin

        str=str.trim();

        str=str.replaceAll("\\s+"," "); // Ali topa vur.

        System.out.println(str);


    }
}
