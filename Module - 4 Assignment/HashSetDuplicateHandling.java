
// 4. How HashSet handles duplicates
import java.util.HashSet;
public class HashSetDuplicateHandling {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        System.out.println("Set: " + set);
    }
}
