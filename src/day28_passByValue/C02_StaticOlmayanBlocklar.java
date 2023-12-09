package day28_passByValue;

public class C02_StaticOlmayanBlocklar {

    C02_StaticOlmayanBlocklar(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti");

        C02_StaticOlmayanBlocklar obj1=new C02_StaticOlmayanBlocklar();
        C02_StaticOlmayanBlocklar obj2=new C02_StaticOlmayanBlocklar();
    }

    {
        // static olmayan bloklar
        // obje olusturulacagi zaman
        // construcrtod'dan hemen once calisir

        // bir obje olusturulmadan once yapilmasi gereken
        // one ayarlar varsa kullanilir

        System.out.println("Static olmayan blok calisti");
    }
}
