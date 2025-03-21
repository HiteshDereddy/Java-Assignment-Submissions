import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable List: " + unmodifiableList);

        // unmodifiableList.add("C"); // This will throw an UnsupportedOperationException
    }
}