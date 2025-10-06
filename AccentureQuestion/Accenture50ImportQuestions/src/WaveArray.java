/*
Question 21:
Develop a program to arrange an unsorted array of integers into a wave array. An array
arr[0..n-1] is considered in wave form if it satisfies the condition:
arr[0] >= arr[1] <= arr[2] >= arr[3] <= arr[4] >= …..
Example:
Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80}
Input: arr[] = {20, 10, 8, 6, 4, 2}
Output: arr[] = {20, 8, 10, 4, 6, 2}
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.Arrays;
import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The output Wave Array  is :" + Arrays.toString(wave(arr)));
    }
    public static int[] wave(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=0; i< n-1; i += 2){
            int temp = arr[i+1];
            arr[i+1] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
