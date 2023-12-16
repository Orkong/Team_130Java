package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {


        String dosyaYolu ="day40_exceptions/yazi.txt";

        // Java'da bilgisayarimizda var olan bir dosyaya ulasmak icin
        // FileInputStream class'i kullanilir

        try {
            FileInputStream fis= new FileInputStream(dosyaYolu);

        } catch (FileNotFoundException e) {

        }

        /* Java bir dosyaya ulasmask istedigimizde o dosyaya ulasmasini istedigimizde
           o dosyaya ulasabileceginden emin olmak ister
           ve bizi bu konuda bir eylem yapmaya zorlamak icin
           kodun altini kirmizi cizer

           kodun altini kizmizi cizmesini,
           bugune kadar hep kodda hata var duzeltmemeiz lazim diye yorumlamistik

           Ancak checked exception'larda
           java riski gorur ve onlem anlamiz icin altini kirmizi cizer

           Java'da dosyadan bilgi alma veya dosyaya bilgi yazdirma(Input / Output IO)
           ile ilgili exception'lar checked exception'lardir
           yani daha compile aninda Java bu riskleri farkeder
           ve bizden cozum ister



         */

        /*
            Checked Exception'lar icini
            Java bize 2 alternatif sunar
            1- suana kadar yaptigimiz gibi
               try-catch ile sarmalayip
               sorun olussa bile calismaya devam etmesini saglayabiliriz

            2- EGER exception kontrol altina alip calismaya devam
               etmesini istemiyorsaniz
               SADECE kirmizi cizgiyi yok etmek
               kodlarimizi calisir hale getirmek ve
               exception olusursa kodlarimizin calismayi durdurmasini istersek
               method deklarasyonuna riskin farkinda oldugumuzu beyan eden
               throws keyword yazmamiz yeterlidir

               throws FileNotFoundException :
               method deklarasyonuna ekledigimiz bu bolum
               riskin farkinda oldugumuzu soyler
               AMA exception'i kontrol altina almaz


         */

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

    }
}
