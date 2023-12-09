package day29_immutableClasses;

import java.time.LocalDate;
import java.util.Locale;

public class C06_LocalDate {

    public static void main(String[] args) {


        LocalDate tarih = LocalDate.now();

        LocalDate dogumTarihi = LocalDate.of(1990,07,24);

        System.out.println(tarih); // 2023-11-29

        // plus...() ile tarihten ileri gidebiliriz
        System.out.println(tarih.plusWeeks(23));

        System.out.println(tarih.plusWeeks(3).plusYears(2).plusDays(5));
        //2025-12-25

        // minus() ile tarihte geriye gidebiliriz
        System.out.println(tarih.minusYears(5).minusMonths(3).minusDays(8));
        // 2018-08-21

        // tarihin istedigimiz bir bolumunu, istedigimiz deger ile degistirebiliriz
        // with...()

        System.out.println(tarih.withYear(2021)); // 2021-11-29

        System.out.println(tarih.withDayOfYear(134)); //2023-05-14

        System.out.println(tarih.getDayOfYear()); // 333

        System.out.println(tarih.getDayOfWeek()); // WEDNESDAY

        System.out.println(tarih.getEra()); // CE

        System.out.println(tarih.lengthOfYear()); // 365

        System.out.println(tarih.isLeapYear()); // false

        LocalDate leapYearKontrol = LocalDate.of(2040,1,1);
        System.out.println(leapYearKontrol.isLeapYear()); // true

        System.out.println(tarih.isBefore(leapYearKontrol)); // true
        System.out.println(tarih.isAfter(leapYearKontrol)); //false
        System.out.println(tarih.isEqual(leapYearKontrol)); //false

        System.out.println(tarih.compareTo(dogumTarihi)); // 33
        System.out.println(tarih.compareTo(leapYearKontrol)); // -17

        System.out.println(dogumTarihi.until(tarih)); // P33Y4M5D

        LocalDate beklenenTarih = LocalDate.of(2024,6,1);
        System.out.println(tarih.until(beklenenTarih));



    }


}
