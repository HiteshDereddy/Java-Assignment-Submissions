import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); list.add(20); list.add(30); list.add(40);
        
        Collections.sort(list);
        int index = Collections.binarySearch(list, 30);
        System.out.println("Index of 30: " + index);
    }
}