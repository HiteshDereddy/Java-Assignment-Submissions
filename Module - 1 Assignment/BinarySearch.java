
// Searching an element in a sorted array using Binary Search
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int target = scanner.nextInt();
        int index = binarySearch(arr, target);
        System.out.println(index == -1 ? "Not found" : "Found at index " + index);
        scanner.close();
    }
}
