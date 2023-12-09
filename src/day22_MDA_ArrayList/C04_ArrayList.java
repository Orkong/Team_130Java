package day22_MDA_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArrayList {

    public static void main(String[] args) {

        List<Integer> sayilar =new ArrayList<>();

        // List<Integer> abc=new List<>(); List interface oldugunda  direk obje olusturulamaz

        ArrayList<Integer> abc= new ArrayList<>(); // bu yazim cok kullanilmaz

        // Liste element eklemek icin

        sayilar.add(7);
        sayilar.add(2);
        sayilar.add(9);

        System.out.println(sayilar); // [7, 2, 9]

        // 7 ile 2 arasina element olarak 5 ekleyin

        sayilar.add(1,5);

        System.out.println(sayilar); //[7, 5, 2, 9]

        // 3 var mi?

        System.out.println(sayilar.contains(3));

        // 5 var mi ?

        System.out.println(sayilar.contains(5));


    }
}
