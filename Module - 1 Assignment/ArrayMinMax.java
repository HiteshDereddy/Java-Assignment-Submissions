
// Finding the largest and smallest numbers in an array
import java.util.Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};
        Arrays.sort(numbers);
        System.out.println("Smallest: " + numbers[0]);
        System.out.println("Largest: " + numbers[numbers.length - 1]);
    }
}
