package day30_timeDate_varargs;

public class C04_VarargsDikkatEdilecekler {

    // argument olarak verilen sayilardan
    // ilke haric geriye kalanlari toplayip
    // bulunan toplami ilk sayi ile carpip
    // sonucu yazdiran bir method olsuturun

    // input = 0,2,3,4,1 output ==> 0 * 10 = 0
    // input = 1,2,3     output ==> 1 * 5 = 5

    public static void main(String[] args) {

        islemYap(0,2,3,4,1);  // 0 * 10 =0
        islemYap(1,2,3);      // 1 * 5 =5
        islemYap(2,3,4,5,6,7,8,9); //2 * 42 = 84
        islemYap(5); // 5 * 0 = 0
        // varargs cok elemani sorun etmedigi gibi hic eleman verilmemesinide sorun etmez


        // islemYap(); CTE array bos kalabilir ama bastaki paramaetre bos kalmaz
    }

    public static void islemYap(int ilkSayi,int... geriyeKalanlar){

        int toplam =0;
        for (int each : geriyeKalanlar
             ) {
            toplam +=each;
        }

        System.out.println(toplam*ilkSayi);

    }
}
