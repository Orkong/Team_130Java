package day22_MDA_ArrayList;

import java.util.Arrays;

public class C02_MDA_Arrays {
    public static void main(String[] args) {


        // Soru 2- Verilen 2 katli bir array’de ayni index’e
        // sahip elementleri toplayip, yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        //input :     int[][] arr = {{3,4,5}, {2,3,6,7}};
        // output:                      [5, 7, 11]

        // output array'i kisa inner array'in uzunluguna esit olacak
        // once 2 tane inner array'e gore soruyu cozelim
        int[][] arr= {{3,4,5,1,9,2,3,4}, {2,3,6,7,8}};

        int outputLegth=arr[0].length>arr[1].length?arr[1].length:arr[0].length;
        int[] output =new int [outputLegth];

        for (int i = 0; i < outputLegth; i++) {

            output[i]=arr[0][i]+arr[1][i];

        }

        System.out.println(Arrays.toString(output)); //[5, 7, 11, 8, 17]

    }
}
