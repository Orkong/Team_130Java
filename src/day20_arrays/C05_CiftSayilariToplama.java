package day20_arrays;

public class C05_CiftSayilariToplama {
    public static void main(String[] args) {

        // verilen bir int array'deki
        // cift sayilarin toplamini yazdirin

        int[] arr={1,2,3,4,5,6,7,8,9,};
        int ciftToplam= 0;

        for (int i = 0; i <arr.length; i++) {

            if (arr[i] % 2 == 0) {
                ciftToplam += arr[i];
            }
        }
        System.out.println(ciftToplam);


    }
}
