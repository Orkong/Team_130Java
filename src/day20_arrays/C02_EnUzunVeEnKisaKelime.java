package day20_arrays;

public class C02_EnUzunVeEnKisaKelime {
    public static void main(String[] args) {

        //Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method olusturun.
        //        Ayni uzunluktaki isimler varsa,herhangi biri yazdirilabilir.


        String [] isimler ={"Sedat","Gul","Eren","Kenan","Mustafa","Ramazan","Abdurrahman","Su"};

        uzunVeKisaIsimYazdir(isimler);

    }

    public static void uzunVeKisaIsimYazdir(String []isimler){

        String enUzunIsim=isimler[0];
        String enKisaIsim=isimler[0];

        for (int i = 1; i < isimler.length ; i++) {

            if (isimler[i].length()>enUzunIsim.length()){
                enUzunIsim=isimler[i];
            }

            if (isimler[i].length()<enKisaIsim.length()){
                enKisaIsim=isimler[i];

            }

        }

        System.out.println("En uzun isim : "+ enUzunIsim);
        System.out.println("En kisa isim : "+ enKisaIsim);



    }


}
