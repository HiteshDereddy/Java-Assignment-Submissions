
// 8. Sort an ArrayList of strings alphabetically and reverse alphabetically
import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");

        Collections.sort(list);
        System.out.println("Sorted: " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse Sorted: " + list);
    }
}
