/*
In the context of a sorted and rotated array containing duplicate elements, your objective is to
devise an algorithm capable of efficiently identifying a specified element within the rotated array.
The algorithm is required to achieve this task with a time complexity of O(log n). Additionally, it is
important to output the index where the key exists, and if there are multiple valid answers, any
of them can be printed. Design a solution that meets these criteria and successfully locates the
specified element in the given rotated array.
Example:
Input: arr[] = {3, 3, 3, 1, 2, 3}, key = 3
Output: 0
arr[0] = 3
Input: arr[] = {3, 3, 3, 1, 2, 3}, key = 11
Output: -1
11 is not present in the given array.
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

public class SearchRotatedArrayWithDuplicates {

    public static int search(int[] arr, int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Step 1: Check if mid is the key
            if (arr[mid] == key) {
                return mid;  // Found
            }

            // Step 2: Handle duplicates (ambiguous situation)
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
            }
            // Step 3: Left half is sorted
            else if (arr[low] <= arr[mid]) {
                if (key >= arr[low] && key < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // Step 4: Right half is sorted
            else {
                if (key > arr[mid] && key <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 3, 3, 1, 2, 3};
        int key1 = 3;


        int result1 = search(arr1, key1);


        if (result1 != -1)
            System.out.println("Key " + key1 + " found at index: " + result1);
        else
            System.out.println("Key " + key1 + " not found.");


    }
}

