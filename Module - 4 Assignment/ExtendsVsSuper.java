import java.util.ArrayList;
import java.util.List;

public class ExtendsVsSuper {
    public static void processNumbers(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    public static void addNumbers(List<? super Integer> list) {
        list.add(42);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        processNumbers(intList);

        List<Number> numList = new ArrayList<>();
        addNumbers(numList);
        System.out.println(numList);
    }
}
