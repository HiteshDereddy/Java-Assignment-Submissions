import java.util.Arrays;

public class SwapElements {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4};
        swap(numbers, 1, 2);
        System.out.println(Arrays.toString(numbers));

        String[] words = {"Hello", "World"};
        swap(words, 0, 1);
        System.out.println(Arrays.toString(words));
    }
}
