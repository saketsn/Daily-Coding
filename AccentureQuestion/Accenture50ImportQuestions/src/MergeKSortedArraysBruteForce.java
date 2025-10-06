/*
You are presented with k sorted arrays, each possessing varying lengths. Your task is to devise
an algorithm that effectively merges these arrays into a singular array, ensuring that the
resulting merged array maintains a sorted order. Formulate a solution that efficiently handles
arrays of different lengths, demonstrating your ability to merge and maintain sorted order in the
merged array. Provide the corresponding code, along with a clear explanation of your algorithm.
Example:
Input : {{3, 13},
{8, 10, 11}
{9, 15}}
Output : {3, 8, 9, 10, 11, 13, 15}
Input : {{1, 5},
{2, 3, 4}}
Output : {1, 2, 3, 4, 5}
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.Arrays;

public class MergeKSortedArraysBruteForce {
    public static void main(String[] args) {
        int[][] arrays1 = {{3, 13}, {8, 10, 11}, {9, 15}};
        int[] result1 = mergeKSortedArrays(arrays1);
        System.out.println(Arrays.toString(result1));  // Output: [3, 8, 9, 10, 11, 13, 15]

        int[][] arrays2 = {{1, 5}, {2, 3, 4}};
        int[] result2 = mergeKSortedArrays(arrays2);
        System.out.println(Arrays.toString(result2));  // Output: [1, 2, 3, 4, 5]
    }
    public static int[] mergeKSortedArrays(int[][] arrays) {

        int totalLength = 0;
        for(int[] arr : arrays){
            totalLength += arr.length;
        }
        int[] merged = new int[totalLength];
        int index = 0;
        for(int[] arr : arrays){
            for(int num : arr){
                merged[index++] = num;
            }
        }


        Arrays.sort(merged);

        return merged;
    }
}
