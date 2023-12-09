package day30_timeDate_varargs;

import java.time.LocalTime;
import java.time.ZoneId;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();

        LocalTime saatUsa = LocalTime.now(ZoneId.of("America/New_York"));

        System.out.println("Newyork saati : "+ saatUsa);
        // Newyork saati : 12:45:21.834005600


        System.out.println(saat.plusHours(10000)); // 04:49:01.561430300
        System.out.println(saat.minusHours(3)
                .minusSeconds(23)
                .minusMinutes(15)); // 09:33:38.56143030

        System.out.println(saat.withMinute(27).withSecond(15)); // 12:27:15.105289400

        System.out.println(saat.withSecond(0).withNano(0)); //12:51

        System.out.println(saat.toNanoOfDay()); // 46387439538100
        // gece 00:00'dan baslayrak saat'in olusturuldugu ana kadar olan nanosaniye

        LocalTime saat1=LocalTime.of(10,45);
        LocalTime saat2=LocalTime.of(14,12,23);

        System.out.println(saat1.isBefore(saat2)); // true
        System.out.println(saat1.isAfter(saat2)); // false

    }
}
