
// 6. Demonstrate uniqueness property of HashSet
import java.util.HashSet;
public class HashSetUniqueness {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        System.out.println("HashSet: " + set);
    }
}
