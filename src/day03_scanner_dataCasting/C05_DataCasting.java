package day03_scanner_dataCasting;

public class C05_DataCasting {

    public static void main(String[] args) {

        // Kucuk data turundeki degeri buyuk data turundeki variable'a
        // atamak isterseniz Java bunu otomatik olarak yapar, buna Auto Widening denir


        byte a = 15;

        short b = a;

        int c = b;

        long d = c;

        double e =d;


        // Buyuk data turundeki degeri kucuk data turundeki variable'a atamak
        // istersek Java bunu otomatik olarak yapmaz, sorumlulugu almamizi ister.
        // Sorumluluk almak icin buyuk data turundeki onune parantez icinde
        // cevirmek istedigimiz kucuk data turunu yazariz
        // Explicit narrowing


        double f = 34.5;

        int g = (int)f;

        short h = (short) g;

        byte k = (byte) h;


    }
}
