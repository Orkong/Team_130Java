package day32_encasulation;

public class C04_EncapsulationRunner {

    public static void main(String[] args) {

        // Access modifier ile bir variable erisim yetkimiz varsa
        // hem yazdirabilir, hem de deger atayabiliriz
        // ulasamiyorsakta hic bir islem yapamayiz



        C03_Encapsulation obj=new C03_Encapsulation();
        //obj.strPrivate="Private";
        //System.out.println(obj.strPrivate);

        obj.strDefault="Default";
        System.out.println(obj.strDefault);
        obj.strProtected="protected";
        System.out.println(obj.strProtected);
        obj.strPublic="Public";
        System.out.println(obj.strPublic);

        // Peki okuma yani degerini goruntuleme yetkisi ile
        // write yani deger atayabilme yetkisini ayirabilir misiniz?

        /*

        ilgili varilable'lari private yaptigimiz icin
        access modifier onlari kullanmamiza hicbir sekilde izin vermez

        obj.satisTutari =20;
        System.out.println(obj.satisTutari);
        obj.toplamSatisTutari =50;
        System.out.println(obj.toplamSatisTutari);

         */

        System.out.println(obj.getToplamSatisTutari());

        obj.setSatisTutari(50);
        obj.setSatisTutari(100);
        obj.setSatisTutari(100);

        System.out.println(obj.getToplamSatisTutari()); // 250
    }
}
