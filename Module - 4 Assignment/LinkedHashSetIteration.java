
// 8. Iterate over LinkedHashSet and explain order-preserving property
import java.util.LinkedHashSet;
public class LinkedHashSetIteration {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("One");
        set.add("Two");
        set.add("Three");

        for (String item : set) {
            System.out.println(item);
        }
    }
}
