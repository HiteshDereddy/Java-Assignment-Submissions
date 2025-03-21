import java.util.*;

public class SetListQueueDifferences {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 1));
        Set<Integer> set = new HashSet<>(list);
        Queue<Integer> queue = new LinkedList<>(list);

        System.out.println("List: " + list);
        System.out.println("Set (No Duplicates): " + set);
        System.out.println("Queue (FIFO): " + queue);
    }
}