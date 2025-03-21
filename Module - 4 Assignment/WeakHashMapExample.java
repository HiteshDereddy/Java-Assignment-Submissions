import java.util.*;

public class WeakHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> weakHashMap = new WeakHashMap<>();

        Integer key = new Integer(1);
        hashMap.put(key, "HashMapValue");
        weakHashMap.put(key, "WeakHashMapValue");

        key = null;
        System.gc();

        System.out.println("HashMap: " + hashMap);
        System.out.println("WeakHashMap: " + weakHashMap);
    }
}