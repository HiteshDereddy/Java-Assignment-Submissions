import java.util.LinkedList;
import java.util.Queue;

public class QueueBookingSystem {
    public static void main(String[] args) {
        Queue<String> ticketQueue = new LinkedList<>();
        ticketQueue.add("Alice");
        ticketQueue.add("Bob");
        ticketQueue.add("Charlie");

        while (!ticketQueue.isEmpty()) {
            System.out.println("Serving: " + ticketQueue.poll());
        }
    }
}