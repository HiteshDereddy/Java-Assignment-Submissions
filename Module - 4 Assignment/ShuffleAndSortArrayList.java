import java.util.ArrayList;
import java.util.Collections;

public class ShuffleAndSortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); list.add(3); list.add(8); list.add(1);

        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}