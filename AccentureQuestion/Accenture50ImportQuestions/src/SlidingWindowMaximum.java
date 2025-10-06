/*
Consider an array arr[] of size N and an integer K. Your task is to determine the maximum value
for each contiguous subarray of size K.
Write a function or algorithm to efficiently solve this problem.
Example:
Input:
Array: [1, 3, 4, 2, 6, 7]
K: 3
Output:
Maximum Values: [4, 4, 6, 7]
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SlidingWindowMaximum {
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
        System.out.println("The out put is :" + Arrays.toString(result(arr,k)));
    }
    public static int[] result(int[] arr,int k){
        int n = arr.length;
        ArrayList<Integer> temp = new ArrayList<>();

        for(int i=0; i<= n-k; i++){
            int max = arr[i];
            for(int j = i; j< i+k; j++){
                max  = Math.max(max, arr[j] );
            }
            temp.add(max);
        }
        int[] res = new int[temp.size()];
        for(int i=0; i< res.length; i++){
            res[i] = temp.get(i);
        }
        return res;
    }
}
