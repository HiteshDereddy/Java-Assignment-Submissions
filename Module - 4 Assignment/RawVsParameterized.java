import java.util.ArrayList;
import java.util.List;

public class RawVsParameterized {
    public static void main(String[] args) {
        List rawList = new ArrayList(); // Raw type (should be avoided)
        rawList.add("String");
        rawList.add(10); // No type safety

        List<String> paramList = new ArrayList<>(); // Parameterized type
        paramList.add("Hello");
        // paramList.add(10); // Compilation error

        System.out.println(paramList);
    }
}
