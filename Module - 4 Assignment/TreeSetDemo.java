
// 3. Demonstrate the use of TreeSet for sorted elements
import java.util.TreeSet;
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(1);
        set.add(2);
        System.out.println("Sorted Set: " + set);
    }
}
