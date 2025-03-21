import java.util.TreeMap;

public class TreeMapSortedOrder {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(50, "Fifty");
        map.put(10, "Ten");
        map.put(40, "Forty");
        map.put(30, "Thirty");
        map.put(20, "Twenty");

        System.out.println("TreeMap sorted order: " + map);
    }
}