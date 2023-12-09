package day20_arrays;

import java.util.Arrays;

public class C06_Sort {
    public static void main(String[] args) {

        String [] isimler= {"Seher","Selim","Songul","Sait","Ali","sedat"};

        System.out.println(Arrays.toString(isimler)); //[Seher, Selim, Songul, Sait, Ali, sedat]

        Arrays.sort(isimler);

        System.out.println(Arrays.toString(isimler));
        // [Ali, Sait, Seher, Selim, Songul, sedat]
        // Natural Order/ Dogal siralama


        // verilen int bir array'deki en kucuk ve en buyuk sayilari yazdirin

        int[] arr ={5,9,1,0,-3,2,5,9,1};
        Arrays.sort(arr); //kucukten buyuge siralar

        System.out.println("En kucuk sayi : "+ arr[0]);
        System.out.println("En buyuk sayi : "+ arr[arr.length-1]);
    }
}
