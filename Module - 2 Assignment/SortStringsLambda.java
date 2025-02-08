import java.util.ArrayList;
import java.util.Collections;

public class SortStringsLambda {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        names.sort((a, b) -> b.compareTo(a));

        for (String name : names) {
            System.out.println(name);
        }
    }
}