import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadSafeCollection {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        list.add(1);
        list.add(2);
        System.out.println("Thread-safe List: " + list);
    }
}