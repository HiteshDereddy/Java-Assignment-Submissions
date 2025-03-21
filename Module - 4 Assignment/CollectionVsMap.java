import java.util.*;

public class CollectionVsMap {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        System.out.println("Collection: " + list);
        System.out.println("Map: " + map);
    }
}