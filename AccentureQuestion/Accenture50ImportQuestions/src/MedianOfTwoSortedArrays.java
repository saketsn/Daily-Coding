/*
In the context of two sorted arrays, namely a[] and b[], with N and M elements, the objective is
to devise an algorithm to determine the median of the combined array. Your task is to formulate
a solution that efficiently computes the median, considering the total number of elements in both
arrays. Develop an algorithm that accurately identifies the median of the merged sorted arrays,
with N and M denoting the number of elements in the respective arrays.
Example:
Input: a[] = {-5, 3, 6, 12, 15}, b[] = {-12, -10, -6, -3, 4, 10}
Output: The median is 3.
Explanation: The merged array is: ar3[] = {-12, -10, -6, -5 , -3, 3, 4, 6, 10, 12, 15}.
So the median of the merged array is 3
Input: a[] = {2, 3, 5, 8}, b[] = {10, 12, 14, 16, 18, 20}
Output: The median is 11.
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st array : ");
        int N = sc.nextInt();
        System.out.print("Enter the size of 2nd array : ");
        int M = sc.nextInt();
        int[] arr1 = new int[N];
        System.out.println("Enter the element of arr1 :");
        for(int i=0; i< N ;i++){
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[M];
        System.out.println("Enter the element of arr2 :");
        for(int i=0; i< M; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.print("Median of the is = "+ median(arr1, arr2));
    }
    public static float median(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int[] arr3 = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        // Merge two sorted arrays
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        while (i < n1) arr3[k++] = arr1[i++];
        while (j < n2) arr3[k++] = arr2[j++];

        int s = arr3.length;
        if (s % 2 == 0) {
            return (arr3[s / 2 - 1] + arr3[s / 2]) / 2.0f; // average of middle two elements
        } else {
            return arr3[s / 2]; // middle element
        }
    }

}
