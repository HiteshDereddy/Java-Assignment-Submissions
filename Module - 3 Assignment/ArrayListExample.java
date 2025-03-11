import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 10; i > 0; i--) {
            numbers.add(i);
        }
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
    }
}