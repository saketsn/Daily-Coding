/*
Examine the array arr[] comprising N distinct integers. Your objective is to determine whether
the array remains sorted after undergoing a counter-clockwise rotation. It is imperative to note
that a conventionally sorted array, without any rotations, does not qualify as sorted and rotated
in this context. In essence, ascertain the presence of at least one rotation for the array to be
considered as sorted and rotated.
Example:
Input: arr[] = { 3, 4, 5, 1, 2 }
Output: true
Explanation:
Sorted array: {1, 2, 3, 4, 5}.
Rotating this sorted array clockwise
by 3 positions, we get: { 3, 4, 5, 1, 2}
Input: arr[] = {7, 9, 11, 12, 5}
Output: true
 */
package AccentureQuestion;

public class SortedandRotatedArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {7, 9, 11, 12, 5};
        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println(isSortedAndRotated(arr1)); // true
        System.out.println(isSortedAndRotated(arr2)); // true
        System.out.println(isSortedAndRotated(arr3)); // false
    }

    public static boolean isSortedAndRotated(int[] arr) {
        int n = arr.length;
        int count = 0;

        // Count how many times arr[i] > arr[i+1]
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                count++;
            }
        }

        // Check the last and first element also
        if (arr[n - 1] > arr[0]) {
            count++;
        }

        // The array is sorted and rotated if count == 1
        // and not purely sorted (rotation exists)
        return count == 1;
    }
}
