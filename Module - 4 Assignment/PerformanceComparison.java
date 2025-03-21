
// 7. Compare performance of ArrayList and LinkedList
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class PerformanceComparison {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        
        long start = System.nanoTime();
        arrayList.add(0, 1);
        long end = System.nanoTime();
        System.out.println("ArrayList insert at beginning: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedList.add(0, 1);
        end = System.nanoTime();
        System.out.println("LinkedList insert at beginning: " + (end - start) + " ns");
    }
}
