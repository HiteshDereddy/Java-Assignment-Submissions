// Demonstration of @SuppressWarnings annotation
import java.util.ArrayList;

public class SuppressWarningsExample {
    @SuppressWarnings("unchecked")
    public void test() {
        ArrayList list = new ArrayList();
        list.add("Example");
        System.out.println(list.get(0));
    }
}