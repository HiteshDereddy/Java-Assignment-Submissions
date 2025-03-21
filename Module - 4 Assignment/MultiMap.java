import java.util.*;

class MultiMap<K, V> {
    private Map<K, List<V>> map = new HashMap<>();

    public void put(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public List<V> get(K key) {
        return map.getOrDefault(key, Collections.emptyList());
    }

    public void remove(K key) {
        map.remove(key);
    }

    public void printMap() {
        System.out.println(map);
    }

    public static void main(String[] args) {
        MultiMap<String, String> multiMap = new MultiMap<>();
        multiMap.put("Fruits", "Apple");
        multiMap.put("Fruits", "Banana");
        multiMap.put("Vegetables", "Carrot");
        
        multiMap.printMap();
    }
}