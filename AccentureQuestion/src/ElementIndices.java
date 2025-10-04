/*
 Elements Equal to Their Indices
Problem Statement:
You are given a function, int ElementsAndIndices(int arr, int n).
The function takes an integer array 'arr' of size 'n' as its arguments.
Implement the function to find and return the number of array elements
which are equal to their index value (i.e., arr[k] = k, where 0 <= k < n).

Note:

Indexing starts from 0.

Return -1 if 'arr' is empty.

Example:

Input: arr = {10, 1, 12, 3, 5, 8, 9, 7, 12, 23}

Output: 3

Explanation: arr[1] = 1, arr[3] = 3, arr[7] = 7. There are 3 such elements.
 */
package AccentureQuestion.src;

import java.util.Scanner;

public class ElementIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int k = sc.nextInt();
        int[] arr = new int[k];
        System.out.println("Enter the element of the array :");
        for(int i=0; i< k; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("The number of array elements which are equal to their index value = "+ count(arr, k));
    }
    public static int count(int[] arr, int k){
        if(arr.length == 0) return -1;
        int c = 0;
        for(int i=0; i< k; i++){
            if(arr[i] == i){
                c++;
            }
        }
        return c;
    }
}
