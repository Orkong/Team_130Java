package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_CokluCheckedException {

    public static void main(String[] args) {

        /*
            Kodumuzda birden fazla exception olusma ihtimali varsa
            tek try, birden fazla catch blogu kullanabiliriz
            catch bloklari siralanirken, exception turleri dikkate alinmalidir

             - EGER olusabilecek exception'lar arasinda
               parent child iliskisi yoksa
               istedigimiz siralamada yazabiliriz

             - EGER olusabilecek excepion'lar parent-child ilsikisina sahip iseler
               bu durumda child olani uste
               parent olani alta yazmaliyiz
               aksi takdirde parent uste olursa

         */

        String dosyaYolu = "day40_exceptions/yazi.txt";

        try {

            FileInputStream fis = new FileInputStream(dosyaYolu); //dosyaya ulasma

            int k = 0;
            while ((k = fis.read()) != (-1)) { // dosyayi okuyup, bize getirme
                System.out.print((char) k);
            }

        }catch (FileNotFoundException e) {
            System.out.println("Yazilan dosya yolunda sorun var");
        }catch (IOException e) {
            System.out.println("Dosya okunurken hata olustu");
        }catch (Exception e) {
            System.out.println("Ongorulemeyen bir exception olustu");
        }



    }
}
