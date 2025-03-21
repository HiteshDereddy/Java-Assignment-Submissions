import java.util.*;

public class IterableExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        for (String s : list) {
            System.out.println(s);
        }
    }
}