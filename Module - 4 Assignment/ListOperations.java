
// 6. Perform operations on List of strings
import java.util.ArrayList;
public class ListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        System.out.println("List: " + list);

        list.remove("Two");
        System.out.println("After removing 'Two': " + list);

        list.set(0, "Updated");
        System.out.println("After replacing index 0: " + list);
    }
}
