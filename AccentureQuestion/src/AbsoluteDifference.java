/*
Problem: Count Elements Within a Difference

Function Signature:

int findCount(int arr[], int length, int num, int diff);


Description:
You are given an integer array arr of size length, an integer num, and an integer diff.
Write a function to count the number of elements in arr whose absolute difference with num is less than or equal to diff.

If no such element exists, the function should return -1.

Input:

arr[] → an array of integers

length → the number of elements in arr

num → the reference number

diff → maximum allowed difference

Output:

An integer representing the count of elements in arr satisfying the condition, or -1 if none exist.

Example:

Input:

arr  = {12, 3, 14, 56, 77, 13}
num  = 13
diff = 2


Output:

3


Explanation:
The elements of arr having absolute difference ≤ 2 with num = 13 are:
12 (|12-13|=1), 14 (|14-13|=1), 13 (|13-13|=0)
Hence, the count is 3.
 */

package AccentureQuestion.src;

import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size the an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the element in the Array :");
        for(int i=0; i< arr.length; i++){
            System.out.println("Enter the element at position "+i+" :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        System.out.println("Enter the diff : ");
        int diff = sc.nextInt();
        System.out.println("Final Answer is : "+ sol(arr, num, diff));

    }

    public static int sol(int[] arr, int num, int diff){
        int count = 0;

        for(int n : arr){
            int temp = Math.abs(n-num);
            if(temp <= diff ){
                count++;
            }
        }
        if(count <1){
            return -1;
        }
        return count;
    }
}
