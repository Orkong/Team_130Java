package day36_overrideng;

public class C05_Child extends C04_Parent{

    public void method1(){

        // child class'da parent class'dan bir method'u override
        // etmek istersek
        // signatue'i parent class'daki method ile ayni olan
        // bir method olusturmaliyiz
        // eger signatue farkli olursa,
        // ismin ayni olmasi overriding icin yeterli degildir.
    }

    public void method2(){

    }

    @Override
    public void method3() {
        // overridding method olusturmak icin
        // @Override notasyonu kullanmak zorulu degildir
        // ama overrid method'u intelliJ'e olusturtursak
        // intelliJ otomatik olarak notasyonu  koyar
        // @Override notasyonu parent class'daki
        // overridden method'u takip eder
        // silinir veya signatue'i degistirilirse
        // CTE verir
        // Notasyon kullanilmayan methodlarda
        // parent class'daki method kontrol edilmez
        // silinmesi veya degisitirilmesi durumunda
        // overridding ozelligi biter ama kod calismaya devam eder
    }

    public static void method4(){
        // static olarak isaretlenen method'lar overrride edilemez
        // child class'da ayni signature's sahip method olusturabilir
        // ama bu ikisi override ilsikisi olusturmaz
        // bagimsiz iki method olurlar







    }

    /*public final String method5(){
        // bir method'un final olarak isaretlerseniz
        // o method override EDILEMEZ

        return null;
    }
     */

    public void method6(){

        // private bir method'u override edemezsiniz
        // child class'da ayni signatue'a sahip
        // method olusturasniz da
        // bu overridding method olmaz
    }

    protected void method7(){
        // HER NE KADAR signature'a dahil olmasa da
        // overridding'de access modifier ad onemlidir
        // parent class'daki method7'nin
        // access modifier'i default oldugundan
        // child class'daki method7
        // default, protected veya public olabilir
        // ama private olamaz


    }

    protected void method8(){
        // parent class'daki method8'in access modifier'i
        // protected oldugundan, child class'daki method8
        // protected veya public olabilir
        // ama default access modifier veya private OLAMAZ
    }

    public void method9(){
        // Overridden method'u return type'i
        // void veya primitive ise
        // overrriden method'un return type'i da ayni OLMALIDIR

    }

    public String method10(){
        // eger overridden method'un return type'i
        // non primitive ise
        // overrridding method'un return type'i
        // YA aynisi olacak
        // YA DA parent class'in return type'i ile
        // IS-A relationship ile ayni olacak
        return null;
    }

    @Override
    public void method11() {
        super.method11();

        // overridding yapildiginda
        // overridden method veya overridding method'dan
        // sadece biri calisir

        // EGER ikisinin de calismasini isterseniz
        // super.methodIsmi yazarak
        // parent'daki method'unda calismasini saglayabiliriz

    }


}
