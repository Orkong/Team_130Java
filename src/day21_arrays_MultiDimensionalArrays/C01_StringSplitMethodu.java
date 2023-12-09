package day21_arrays_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_StringSplitMethodu {
    public static void main(String[] args) {

        String str="java gun gectikce guzellesiyor";
        //e harflerinden str'i parcalara ayirin

        System.out.println(Arrays.toString(str.split("e")));
        //[java gun g, ctikc,  guz, ll, siyor]

        System.out.println(Arrays.toString(str.split(" ")));
        //[java, gun, gectikce, guzellesiyor]

        System.out.println(Arrays.toString(str.split("gec")));
        //[java gun , tikce guzellesiyor]

        System.out.println(Arrays.toString(str.split("")));
        //[j, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]



        // verilan bir arama sonucundan
        // arama sonucunun 1000' den fazla oldugunu test edin

        String aramaSonucu = "1-48 of over 700 results for java";

        String [] kelimer =aramaSonucu.split(" ");

        System.out.println(Arrays.toString(kelimer));
        //[1-48, of, over, 5,000, results, for, java]

        String aramaSonucSayiyiStr= kelimer[3]; //5,000

        aramaSonucSayiyiStr=aramaSonucSayiyiStr.replace("\\D","");

        int aramaSonucSayisi=Integer.parseInt(aramaSonucSayiyiStr);

        if (aramaSonucSayisi>1000){
            System.out.println("Arama sonuc sayisi testi PASSED");
        }else {
            System.out.println("Arama sonuc sayisi FAILED");
        }

    }

}
