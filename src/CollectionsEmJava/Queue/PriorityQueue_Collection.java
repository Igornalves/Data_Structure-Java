package CollectionsEmJava.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_Collection {

    // Ja na utilizacao desta classe chamada de PriorityQueue
    // o procedimento de entrada e saida usa o conceito de FIFO (first-in first-out)
    // ou seja o primeiro a entra e o primeiro a sair
    // Ele contem uma Ordenação Natural

    public static void main(String args[]) {
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
