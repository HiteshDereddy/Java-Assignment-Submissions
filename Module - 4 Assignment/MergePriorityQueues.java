import java.util.PriorityQueue;

public class MergePriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(3); pq1.add(1); pq1.add(4);

        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(6); pq2.add(2); pq2.add(5);

        pq1.addAll(pq2);
        System.out.println("Merged & Sorted PriorityQueue: " + pq1);
    }
}