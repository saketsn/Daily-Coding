/*
Create an algorithm to efficiently sort an array of N elements, considering that each element is
at most K positions away from its target position. The algorithm should achieve a time
complexity of O(N log K).
Example:
Input: arr[] = {6, 5, 3, 2, 8, 10, 9}, K = 3
Output: arr[] = {2, 3, 5, 6, 8, 9, 10}
Input: arr[] = {10, 9, 8, 7, 4, 70, 60, 50}, k = 4
Output: arr[] = {4, 7, 8, 9, 10, 50, 60, 70}
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.Scanner;

public class SortKSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        System.out.print("Enter the value of k :");
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

    }
}
