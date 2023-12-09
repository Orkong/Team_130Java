package day32_encasulation;

public class C06_Runner {

    public static void main(String[] args) {
        C05_Encapsulation obj=new C05_Encapsulation();

        /*
            Bir class'daki tum variable'lar private yapilip
            sadece getter method'lari olusturulursa
            bu class read only(immutable) olur


         */

        /*
            Bir variabl'i private yapip
            hem getter hem de setter methodu'u olusturursak
            public gibi olur

            Bu yontem bazi developer'lar tarafindan
            yapilan isleme vurgu yapmak amaciyla kullanilir
         */

        //isme deger atama
        obj.setIsim("Ali");
        // isim variable'nin degerini yazdiralim
        System.out.println(obj.getIsim()); //Ali

        // soyisime deger atayalim
        obj.soyIsim ="Celik";
        //soyisim variable'nin degerini yazdiralim
        System.out.println(obj.soyIsim); // Celik



    }
}
