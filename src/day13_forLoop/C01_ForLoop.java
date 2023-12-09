package day13_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        /*
            Baslangic ve bitis degerleri bilinen veya tekrar sayisi belli olan
            ilsmleri yapmak icin for loop kullanilir
         */

        // 10'dan baslayarak 30'dan kucuk olan sayilari yazdirin

        for (int i = 10; i < 30; i++) {
            //baslangic degeri        loop bitirme sarti          i'nin artis bicimi
            //              loop bitirme sart true oldugu surece devam

            System.out.print(i + "  ");

        }

        System.out.println(""); // alt satira gecmek icin yazildi

        // iki basamakli tek sayilari yan yana yazdirin
        // 1- eger biliyorsaniz ilk ve son yazdirilacak sayiyi belirler
        // tek sayilar dedigi icin 2'ser 2'ser ilerleriz

        for (int i = 11; i <= 99; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // 2- baslangic ve bitis degerlerini biz bilmeyebiliriz
        // 2 basamakli dedigi icin iki basamakli tum sayilari elden geciririm

        for (int i = 10; i < 100; i++) {  //10,11,12,13,14,15,....,99

            // tek sayilari yazdirmamizi istedigi icini
            // sayiyi kontrol edip tekse yazdiririm

            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

        // 752 ve 1326 dahil olmak uzere aralarinda 19 ile bolunen sayilari yazdirin

        for (int i = 752 ; i <=1326 ; i++) {
            if (i % 19==0){
                System.out.print(i + " ");
            }

        }


    }


}

