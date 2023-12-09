package day08_nestedIfElseStatements;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        //Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin,
        // degilse “Eskenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini girin");
        double kenar1=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double kenar3=scan.nextDouble();


        System.out.println(
                kenar1 == kenar2 && kenar1==kenar3 && kenar1>0
                ?
                "Eskenar ucgen"
                :
                "Eskenar degil" );
    }
}
