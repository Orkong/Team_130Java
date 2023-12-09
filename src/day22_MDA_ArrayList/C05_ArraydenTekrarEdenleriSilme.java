package day22_MDA_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArraydenTekrarEdenleriSilme {

    public static void main(String[] args) {

        // Verilen bir array'de tekrar eden elementleri silip
        // array 'i her elementin sadece bir kere kullanildigi
        // hale getirin

        int[] arr={2,3,5,7,6,5,8,9,23,1,4,5,3,6,11};

        List<Integer> tekrarsizList =new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!tekrarsizList.contains(arr[i])){
                tekrarsizList.add(arr[i]);
            }

        }

        System.out.println(tekrarsizList);

        // tekrarsiz hale gelen array DEGIL, bizim olusturdugumuz liste
        // array'e yeni bir array degeri atayip, listedeki elementler yeni array'e tasimaliyiz

        arr=new  int[tekrarsizList.size()];

        for (int i = 0; i < arr.length; i++) {
            arr[i]= tekrarsizList.get(i);
        }

        Arrays.sort(arr);

        System.out.println("Array'in son hali : "+ Arrays.toString(arr));
        //Array'in son hali : [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 23]

    }
}
