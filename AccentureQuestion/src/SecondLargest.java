/*
Problem Statement:

Write a program to find the second largest element in a given integer array.

Requirements:

The array contains integers (positive, negative, or zero).

You need to return the second largest unique element.

If the array has less than 2 distinct elements, the program should return Integer.MIN_VALUE (or handle it with a suitable message).

Input:

An integer array, for example:

[1, 3, 5, 2, 4, 6, 8]

Output:

The second largest element in the array.

Example 1:

Input:  [1, 3, 5, 2, 4, 6, 8]
Output: 6
 */
package AccentureQuestion.src;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the element of the array ");
        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The second largest element is : "+ second(arr));
    }
    public static int second(int[] arr){
        int n = arr.length;
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for(int i=0; i< n; i++){
            if(arr[i] > first){
                sec = first;
                first = arr[i];
            }else if(arr[i] > sec && arr[i] < first){
                sec = arr[i];
            }
        }
        return sec;
    }
}
