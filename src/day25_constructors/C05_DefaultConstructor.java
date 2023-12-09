package day25_constructors;

public class C05_DefaultConstructor {

    public static void main(String[] args) {

        /*
            Java bir class olusturuldugunda
            OOP kullanilarak bu class'dan obje olusturulabilmesi icin
            class'a default bir constructor koyar

            Default constructor GORUNMEZ
            ve body'sinde kod yoktur
         */


        C02_Araba araba=new C02_Araba();

        araba.marka="BMW";
        araba.model="5.20";
        araba.renk="Kirmizi";
        araba.yil= 2010;
        araba.fiyat=15000;

        // arabanin objesinin ozelliklerini yazdirin

        System.out.println("Marka : " +araba.marka +
                          ", model :" + araba.model +
                          ", renk :" + araba.renk+
                          ", yil :" +araba.yil+
                          ", fiyat : "+araba.fiyat);

        // Marka : BMW, model :5.20, renk :Kirmizi, yil :2010, fiyat : 15000

        System.out.println(araba);
    }
}
