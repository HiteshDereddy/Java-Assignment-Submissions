import java.util.*;

public class PrintCollection {
    public static <T> void printElements(Collection<T> collection) {
        for (T element : collection) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30));
        Queue<Double> queue = new LinkedList<>(Arrays.asList(1.1, 2.2, 3.3));

        System.out.println("List elements:");
        printElements(list);

        System.out.println("Set elements:");
        printElements(set);

        System.out.println("Queue elements:");
        printElements(queue);
    }
}