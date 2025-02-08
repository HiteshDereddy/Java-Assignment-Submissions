import java.util.function.Function;

public class MethodReferenceExample {
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> squareFunc = MethodReferenceExample::square;
        System.out.println("Square of 5: " + squareFunc.apply(5));
    }
}