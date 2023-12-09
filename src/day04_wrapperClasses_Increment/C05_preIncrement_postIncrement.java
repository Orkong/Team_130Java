package day04_wrapperClasses_Increment;

public class C05_preIncrement_postIncrement {

    public static void main(String[] args) {

        int a = 10;

        a ++;
        System.out.println("a'nin degeri : "+ a);

        a =10;

        ++a;
        System.out.println("a'nin degeri : "+ a);

        /*
           Java'da 3 farkli sekilde deger artirma mumkn

           - sayi = sayi+1;
           - sayi +=;
           - sayi ++;

          Sadece 3. yontem icin Java ihtiyaca gore kullanilabilmesi amaciyla
          2 farkli kullanim olusturmustur.

          sayi ++ yazabildigimiz gibi ++sayi da yazabiliriz

;
         */
        int b = 10;
        System.out.println("++b yazdigimda konsolda yazdirilan :" +  ++b);
        System.out.println("++b den bir satir sonra konsolda b degeri : " + b);


        int c = 10;
        System.out.println("c++ yazdigimda konsolda yazdirilan :" +  c++);
        System.out.println("c++ den bir satir sonra konsolda b degeri : " + c);

        int x =10;
        int y =x++;

        System.out.println("x : "+ x +" y :" + y);  // x: 11, y: 10

        x=10;
        y=++x;

        System.out.println("x : "+ x + " y : "+ y);  // x: 11 y: 11

    }
}
