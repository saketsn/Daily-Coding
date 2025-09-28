/*
Problem Statement :

You are given a function, void MaxInArray(int arr[], int length); The function
accepts an integer array ‘arr’ of size ‘length’ as its argument. Implement the
function to find the maximum element of the array and print the maximum element
and its index to the standard output

(STDOUT). The maximum element and its index should be printed in separate lines.

Note:

Array index starts with 0
Maximum element and its index should be separated by a line in the output
Assume there is only 1 maximum element in the array
Print exactly what is asked, do not print any additional greeting messages
Example:

Input:
23 45 82 27 66 12 78 13 71 86

Output:
86

9

Explanation:
86 is the maximum element of the array at index 9.


 */
package AccentureQuestion.src;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array :");
        int[] arr = new int[n];
        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        max(arr, n);

    }
    public static void max(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int index = 0;
        for(int i=0; i< n; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.print("The maximum element of the given array is : "+ max);
        System.out.println();
        System.out.print("And the index of the element is  : "+ index);
    }
}
