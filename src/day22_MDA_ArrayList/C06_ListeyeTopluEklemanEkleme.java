package day22_MDA_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ListeyeTopluEklemanEkleme {

    public static void main(String[] args) {

        // eger yeni olusturdugumuz bir List'e toplu olarak eleman eklemek istersek
        // array olsuturup loop ile List'e ekleyebiliriz

        int[] arr={3,4,5,6,7,2,3,4,9,7,8};

        List<Integer>sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {

            sayilar.add(arr[i]);

        }

        System.out.println(sayilar); // [3, 4, 5, 6, 7, 2, 3, 4, 9, 7, 8]
    }
}
