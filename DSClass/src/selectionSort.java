package DSClass.src;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {45, 6, 23, 56, 78, 2, 32};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Start from i+1 to end
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) { // Find the minimum
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
