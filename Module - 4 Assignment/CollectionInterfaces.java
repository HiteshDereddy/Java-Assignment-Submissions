import java.util.*;

public class CollectionInterfaces {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        numbers.forEach(System.out::println);
    }
}