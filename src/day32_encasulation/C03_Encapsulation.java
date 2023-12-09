package day32_encasulation;

public class C03_Encapsulation {

    private String strPrivate;
    String  strDefault;
    protected String strProtected;
    public String strPublic;

    private  int satisTutari;


    public void setSatisTutari(int satisTutari) {
        this.satisTutari = satisTutari;
        toplamSatisTutari+=satisTutari;

    }
    private int toplamSatisTutari;

    public int getToplamSatisTutari() {
        return toplamSatisTutari;
    }
// baska class'lar satisTutari variable'ina deger atayabilsin
    // aranan her deger toplam satis tutarina otomatik olarak eklensin
    // ama satis tutari variable'inin degerini kimse yazdiramasin
    // buna deger atanabilsin ama atanan degerles gorulemesin

    // toplam satis tutari degerini baska class'lar gorebilsin
    // ama kimse toplam satis tutari variable'ina deger atayamasin
    // degeri gorulebilsin ama deger atanamasin


    public static void main(String[] args) {

        /*
            Direk erisim icin sadece access modifier yeterli olmaz
            static keyword'e bakmak gerekir.


         */

        C03_Encapsulation obj=new C03_Encapsulation();

        obj.strDefault ="Default variable";
        System.out.println(obj.strDefault); // Default variable

        obj.strPrivate="private variable";
        System.out.println(obj.strPrivate); // private variable

    }
}
