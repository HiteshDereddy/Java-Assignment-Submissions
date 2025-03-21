import java.util.*;

public class CollectionFrameworkVsArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));

        System.out.println("Array length: " + array.length);
        System.out.println("List size: " + list.size());
    }
}