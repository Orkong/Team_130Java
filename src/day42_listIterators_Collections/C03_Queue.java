package day42_listIterators_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

    public static void main(String[] args) {


        /*
            Queue(kuyruk) yapisi geregi
            eklenenler otomatik olarak sona eklenir
            ve silinenler bastan silinir

         */
        Queue<Integer> queue = new LinkedList();

        queue.add(6);
        queue.add(9);
        queue.add(2);

        System.out.println(queue); // [6, 9, 2]

        queue.remove();
        System.out.println(queue); // [9, 2]

        System.out.println(queue.element()); // 9 en bastaki elemento solmeden bize getirir

        System.out.println(queue); // [9, 2]

        System.out.println(queue.peek());

        Queue<Integer>bosQueue =new LinkedList<>();

        // bosQueue.element(); // .NoSuchElementException
        System.out.println(bosQueue.peek()); // null
        // ikisi ayni islevi yapar ama aralarindaki fark
        // bos queue'da biri exception firlatir,oteki null dondurur

        queue.offer(7);

        System.out.println(queue); // [9, 2, 7]

        // add ile ayni islevi yapar
        // aralarindaki fark, add her durumde ekler
        // ama offer kapasite sinirlamasi yoksa ekler

        System.out.println(queue.poll()); // queue'nun basindaki elementi siler ve bize getirir

        System.out.println(queue); // [2, 7]

        System.out.println(queue.isEmpty());  // false




    }
}
