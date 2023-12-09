package day23_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class C03_Remove {
    public static void main(String[] args) {

        List<Integer>sayilar =new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(0);

        System.out.println(sayilar); //[3, 5, 2, 0]


        /*
            Remove 2 sekilde yapilabilir
            remove(index)
            remove(object)

            sayilar(0) eleman 0 mi yoksa index 0 mi?

            Eger listemiz Integer'lardan olusuyorsa
            Java paramatre olarak yazdigimiz int sayiyi direk index kabul eder

            Eger element olarak herhangi bir sayiyi silmek isterseniz
            once bir Object olarak o sayiyi tanimlamali
            sonra silmelisiniz

         */

        sayilar.remove(0);
        System.out.println(sayilar); //[5, 2, 0]

        // eleman olarak 5 silmesini istersek
        // Once bir obje olarak 5'i tanimlamaliyiz

        Object silinecekElement = 5;

        sayilar.remove(silinecekElement);

        System.out.println(sayilar); //[2, 0]


    }
}
