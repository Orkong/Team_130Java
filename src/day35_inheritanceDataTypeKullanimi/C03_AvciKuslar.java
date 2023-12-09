package day35_inheritanceDataTypeKullanimi;

public class C03_AvciKuslar extends C02_Kuslar {

    String hareket = "ucarlar";
    String  beslenme ="et yerler";
    String pence ="pencelidir";
    String gaga ="sivri gagalidir";

    public static void main(String[] args) {

        /*
            Eger ozellikler variable oalrak olusturulursa
            guncel bilgiye bakilmaz
            obje hangi data turunu kullanmissa
            o class'daki diger objelerde ayni ozellikleri tasir.

            Bir objenin hangi degerleri alacagini bulmak icin
            OBJENIN DATA TURU olan class'dan aramaya baslariz
            ve ilk buldugumuz degeri kullaniriz

            aradigimiz variable'i bulamazsak CTE olur

            NOT: eger ozellikler variable olarak olusturulduysa
            constructor'in variable'larin degeri uzerinde hicbir etkisi olmuyor
            tum degerler data type'i olan class'a gore belirleniyor

         */

        C03_AvciKuslar avciKus1 =new C03_AvciKuslar();

        System.out.println(avciKus1.omur); // yasar ve olur H
        System.out.println(avciKus1.cogalma); // Yumurta K
        System.out.println(avciKus1.kanat); // kanatlidir K
        System.out.println(avciKus1.solunum); // akciger K
        System.out.println(avciKus1.hareket); // ucarlar AVK
        System.out.println(avciKus1.solunum); // akciger K
        System.out.println(avciKus1.beslenme); //et AVK
        System.out.println(avciKus1.gaga); // sivri gaga AVK
        System.out.println(avciKus1.pence); // pencelidir AVK

        C02_Kuslar avciKus2= new C03_AvciKuslar();

        System.out.println(avciKus2.omur); // yasar ve olur H
        System.out.println(avciKus2.cogalma); // Yumurta K
        System.out.println(avciKus2.kanat); // kanatlidir K
        System.out.println(avciKus2.solunum); // akciger K
        System.out.println(avciKus2.hareket); // hareket ederler H
        System.out.println(avciKus2.solunum); // akciger H
        System.out.println(avciKus2.beslenme); //beslenirler H
        System.out.println(avciKus2.gaga); // sivri gaga AVK
        // System.out.println(avciKus2.pence); // CTE

        C01_Hayvanlar avciKus3= new C03_AvciKuslar();

        System.out.println(avciKus3.omur); // yasar ve olur H
        System.out.println(avciKus3.solunum); // nefes alirlar H
        System.out.println(avciKus3.cogalma); // cogalirlar H
        // System.out.println(avciKus3.kanat); // CTE
        System.out.println(avciKus3.hareket); // hareket ederler H
        System.out.println(avciKus3.beslenme); //beslenirler H
        // System.out.println(avciKus3.gaga); // CTE
        // System.out.println(avciKus3.pence); // CTE


        C02_Kuslar kus1= new C02_Kuslar();
        System.out.println(kus1.omur); // yasar ve olur H
        System.out.println(kus1.cogalma); // Yumurta K
        System.out.println(kus1.kanat); // kanatlidir K
        System.out.println(kus1.solunum); // akciger K
        System.out.println(kus1.hareket); // hareket ederler H
        System.out.println(kus1.solunum); // akciger H
        System.out.println(kus1.beslenme); //beslenirler H
        System.out.println(kus1.gaga); // sivri gaga AVK
        // System.out.println(kus1.pence); // CTE
    }
}
