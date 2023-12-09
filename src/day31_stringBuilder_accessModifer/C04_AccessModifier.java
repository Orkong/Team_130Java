package day31_stringBuilder_accessModifer;

public class C04_AccessModifier {

    private String strPrivate;
    int sayiDefault; // eger gorunur bir access modifier yoksa, default access modifier gecerli
    protected boolean blProtected;

     public void methodPublic(){


    }
    /*
        Nasil ki class level'da olusturulan ama deger atanmayan variable'lara
        Java default deger tanimliyorsa

        method'lar veya class level'da olsuturulan variable'lar icin
        access modifieer yazilmazsa
        java access modifier olarak "DEFAULT ACCESS MODIFIER" tanimlar

        1 - En genis accesss modifier public ==> herkes erisebilir
        2 - protected : ==> icinde bulundugumuz class,package ve baska package'daki child class'lar
        3 - default access modifier ==> icinde bulundugu class ve icinde bulundugu package'daki diger class'lar
        4 - En dar access modifier : private ==> sadece icinde bulundugu class'dan kullanilabilir
     */

    public static void main(String[] args) {

        /*
            Bir obje olusturursak icinde bulundugumuz class'daki
            tum access modifier'lara ulasabiliriz

         */

        C04_AccessModifier obj=new C04_AccessModifier();
        System.out.println(obj.strPrivate);
        System.out.println(obj.sayiDefault);
        System.out.println(obj.blProtected);
        obj.methodPublic();

    }
}
