import java.util.*;

public class CollectionVsCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1));
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}