import java.util.PriorityQueue;

public class PriorityQueueTasks {
    public static void main(String[] args) {
        PriorityQueue<Integer> tasks = new PriorityQueue<>();
        tasks.add(3);
        tasks.add(1);
        tasks.add(2);

        while (!tasks.isEmpty()) {
            System.out.println("Processing task: " + tasks.poll());
        }
    }
}