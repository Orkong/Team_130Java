package day25_constructors;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        /*
            Java da her olusturdugumuzda
            java objeyi olusturur ve instance
            variablar'in birer kopyasini bu objeye
            yapistirir

            Bu islemi java'da yapan yapi
            CONSTRUCTOR'dir.

            bir constructor calismadan olusturulan objeye
            ilk deger atamasini (initialization) yapilmasi
            mumkun degildir

            Bir constructor olusturmak icin
            syntax ClassAdi(){ } seklindedir

            // C02_Araba() yazimi method'a benzer
            ama method degil Constructor'dir.

            Bir yapinin method mu yoksa constructor mi
            oldugunu anlamak icin 2 seye bakmaliyiz

            1-constructor'in ismi class ile ayni olmalidir
              (yani buyuk harfle baslar)
            2-constructor'larin return type'i olmaz
         */

        C02_Araba                      araba        =           new      C02_Araba();
    // Objenin olusturuldugu class  Objenin adi  assignment   keyword    Constructor
    // Objenin data turu

    }
}
