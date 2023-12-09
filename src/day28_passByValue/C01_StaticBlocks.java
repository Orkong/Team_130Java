package day28_passByValue;

public class C01_StaticBlocks {

    C01_StaticBlocks(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("Main method calisti");

        C01_StaticBlocks obj =new C01_StaticBlocks();

    }

    static{
        // bu yapiya staticBlok denir
        // static bloklar herseyden once hatta main method'dan bile once calisir
        // eger bir class icin main method calismadan yapilmasi gereken on ayarlar
        // varsa static blok kullanilarak yapilir

        // bir class ta birden fazla static blok olabilir
        // eger birden fazla staticblok varsa
        // kendi iclerinde once yukaridaki calisir

        System.out.println("Static blok calisti");
    }

    static {
        System.out.println("2.static blok calisti");
    }


    public static void method1(){

        System.out.println("Method1 calisti");
    }
}
