package CollectionsEmJava.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Collection {
    public static void main(String args[]) {
        //Ordenação Natural
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");

        System.out.println();
        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }
        System.out.println();
    }
}
