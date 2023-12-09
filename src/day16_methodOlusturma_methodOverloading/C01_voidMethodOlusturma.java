package day16_methodOlusturma_methodOverloading;

public class C01_voidMethodOlusturma {
    public static void main(String[] args) {

        // input olarak verilen isim, soyisim ve kredi karti bilgilerini
        // asagidaki formatta yazdiran bir method olusturun
        // isim : Fur*** Bah**
        // kart no : **** **** **** 5643

        // kisiBilgileriYazdir("Orkun", "Esatoglu", "1234567888901");

    }

    public static void kisiBilgileriYazdir(String isim, String soyisim, String krediKartNo){

        System.out.println(
                "isim : " +
                 isim.substring(0,1).toUpperCase() + isim.substring(1,4).toLowerCase()
                        +isim.substring(3).replaceAll("\\w","*")+
                        " " +
                        soyisim.substring(0,1).toUpperCase() + soyisim.substring(1,4).toLowerCase()
                        +soyisim.substring(3).replaceAll("\\w","*")+

                        "\nkart no : " +
                        "**** **** **** **** "+krediKartNo.substring(krediKartNo.length()-4)



        );

    }
}
