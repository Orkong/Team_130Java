package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_PozitifTamBolenlerListesi {

    public static void main(String[] args) {

        //Soru 6- Verilen pozitif bir tamsayiyi,
        // tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturun.

        int sayi =20; // [1,2,4,5,10,20]

        List<Integer>tamBolen = new ArrayList<>();

        for (int i = 1; i <=sayi; i++) {

            if (sayi%i== 0){
                tamBolen.add(i);
            }
        }

        System.out.println(tamBolen); // [1, 2, 4, 5, 10, 20]

    }
}
