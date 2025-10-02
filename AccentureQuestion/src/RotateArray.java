/*

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

*/

package AccentureQuestion.src;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array ");
        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of the k : ");
        int k = sc.nextInt();

        System.out.println(Arrays.toString(arr));;


        rotate(arr, k);
        System.out.println(Arrays.toString(arr));


    }
    public static void rotate(int[] arr, int k){
         k = k % arr.length;
        reverse(arr, 0, arr.length-1);

        reverse(arr,0,k-1);

        reverse(arr, k , arr.length-1);

    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
