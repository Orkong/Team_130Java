package day42_listIterators_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_Set {

    public static void main(String[] args) {

        // set'in 2 ozelligi mutlaka bilinmeli
        // 1- her elemandan sadece 1 tane olabilir
        // var olan elementi yeniden eklemek isterseniz
        // eskiyi siler ayni elementin yenisini kaydeder
        // 2- index desteklemez

        int[] arr = {2, 3, 4, 2, 6, 7, 8, 4, 5, 7, 3, 2, 1, 9, 5, 3, 5};

        // verilen array'i unique elementlerden olusan
        // tekrarsiz bir array haline getirin

        Set<Integer> uniqueSet=new HashSet<>();

        // bir loop ile array'deki tum sayilari uniqueSet'e ekleyelim

        for (int each: arr
             ) {
            uniqueSet.add(each);

        }

        System.out.println(uniqueSet); //[1, 2, 3, 4, 5, 6, 7, 8, 9]

        // Bizim unique sayilarlar elde ettigimiz set
        // simdi bu set'teki elementleri, kendi arr'mize atamaliyiz

        arr=new int[uniqueSet.size()];

        int index =0;
        for (Integer each :uniqueSet
             ) {
            arr[index]= each;
            index++;
        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr));
        // Array'in son hali : [1, 2, 3, 4, 5, 6, 7, 8, 9]


    }
 }
