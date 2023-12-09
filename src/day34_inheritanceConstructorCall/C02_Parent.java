package day34_inheritanceConstructorCall;

public class C02_Parent extends C01_GP{

    C02_Parent(){
        System.out.println("Parent paremetresiz constructor");
    }

    C02_Parent(int a){
        System.out.println("Parent int paremetreli constructor");
    }

    C02_Parent(String b){
        this();
        System.out.println("Parent String paremetreli constructor");
    }

    C02_Parent(boolean c){
        super('c');
        System.out.println("Parent boolean paremetreli constructor");
    }
}
