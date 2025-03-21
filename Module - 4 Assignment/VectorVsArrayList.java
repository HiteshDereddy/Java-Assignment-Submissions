import java.util.*;

public class VectorVsArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        arrayList.add(1);
        vector.add(1);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("Vector: " + vector);
    }
}