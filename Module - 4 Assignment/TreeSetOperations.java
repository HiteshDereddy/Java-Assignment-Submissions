
// 7. Perform operations on TreeSet
import java.util.TreeSet;
public class TreeSetOperations {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(1);
        set.add(3);
        System.out.println("Min: " + set.first());
        System.out.println("Max: " + set.last());
        set.remove(3);
        System.out.println("After Removal: " + set);
    }
}
