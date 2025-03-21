import java.util.concurrent.*;
import java.util.PriorityQueue;

public class BlockingQueueVsPriorityQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(3);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        bq.put(10);
        bq.put(5);
        bq.put(20);

        pq.add(10);
        pq.add(5);
        pq.add(20);

        System.out.println("BlockingQueue: " + bq);
        System.out.println("PriorityQueue: " + pq);
    }
}