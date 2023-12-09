package day16_methodOlusturma_methodOverloading;

public class C03_StringMethodlari {
    public static void main(String[] args) {

        String str="Java cok kolay, yeter ki anlayalim";

        str.toLowerCase(); // Metni kucuk harfe cevirir
                           // Ama yazdirmadigimiz veya atama yapmadigimiz icin bosa calismis olur

        C02_returnTypeIleMethodOlusturma.ismiIstenenFormataCevir("Asli", "Enver");

        // bize birsey donduren method'lari ya uygun bir variable'a atamaliyiz
        // veya direk olarak yazdirmaliyiz
        // aksi taktirde method calisir, bize sonucu dondurur(getirir)
        // ama kullanmadigimiz icin havaya ucar


        // bu method void oldugundan
        // sadece cagirabilirim
        C01_voidMethodOlusturma.kisiBilgileriYazdir("Ayse","Hanci","1233455642342");
        //isim : Ayse* Hanc**
        //kart no : **** **** **** **** 2342

        C02_returnTypeIleMethodOlusturma.ismiIstenenFormataCevir("Kemal","Yanci");
        // bu method bana metho'da donusturulen halini dondurur
        // K**** Y****
        // ama yazdirmazsak konsolda bir sey gormeyiz


        String donusmusIsim = C02_returnTypeIleMethodOlusturma.ismiIstenenFormataCevir("Kemal","Yanci");

        System.out.println(donusmusIsim); // K**** Y****

    }
}
