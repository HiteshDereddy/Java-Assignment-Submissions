import java.util.TreeMap;

public class TreeMapSorting {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");
        map.put(5, "E");
        map.put(4, "D");

        System.out.println("Sorted TreeMap: " + map);
    }
}