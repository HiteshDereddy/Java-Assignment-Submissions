import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMapVsLinkedHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        int[] keys = {3, 1, 4, 2, 5};
        for (int key : keys) {
            hashMap.put(key, "Value" + key);
            linkedHashMap.put(key, "Value" + key);
        }

        System.out.println("HashMap (Unordered): " + hashMap);
        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);
    }
}