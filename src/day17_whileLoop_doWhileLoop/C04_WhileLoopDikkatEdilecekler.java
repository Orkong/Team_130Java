package day17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_WhileLoopDikkatEdilecekler {
    public static void main(String[] args) {

        // 1- While parantezinde kontrol ettigimiz degisken
        //    Loop icerisinde degistirilmezse sonsuz loop olusur

        int sayi= 5;
        int sayac=0;

        while (sayi <= 10){
            sayac++;
            System.out.print(sayac + " ");
            sayi++;

        }

        // 2- loop olusturulmadan once ihtiyac duydugumuz variable'lari biz olusturuyorsak
        //   loop'un ilk defa calismasini ve kullanicidan degerler almasini ENGELLEMEYECEK
        // bir deger atamaya dikkat etmeliyiz

        // kullanicidan sayilar isteyin,
        // verilen pozitif oldugu muddetce
        // sayilari toplayalim ve negatif sayi girildiginde toplami yazdirin

        sayi=20;
        int toplam=0;

        Scanner scan=new Scanner(System.in);

        while (sayi >0 ){

            System.out.println("Lutfen toplanmka uzere pozitif tam sayilar girin");
            sayi=scan.nextInt();
            if (sayi>0) toplam+=sayi;
        }
        System.out.println(toplam);

        // 3- eger loop parantezinde yazdigimiz degisken icin
        // loop icerisinde kullanicidan deger aliyorsak
        // aldigimiz degerin, loop bitimer ozelligi olmayan bir deger oldugundan
        // emin olduktan sonra islemimizi yapmaliyiz


    }
}
