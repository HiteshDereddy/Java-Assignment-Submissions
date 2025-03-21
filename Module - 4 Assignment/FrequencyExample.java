import java.util.ArrayList;
import java.util.Collections;

public class FrequencyExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple"); list.add("banana"); list.add("apple"); list.add("apple");

        System.out.println("Frequency of 'apple': " + Collections.frequency(list, "apple"));
    }
}