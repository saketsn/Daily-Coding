/*
# Given an array of integers, write a function that finds the missing number.
# Input: [1,2,4,5,6]
# Output: 3
 */

package AccentureQuestion.src;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        System.out.println("Enter the element of the array :");

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("The missing number is : "+ solution(arr));
    }
    private static int solution(int[] arr){
        Arrays.sort(arr);
        for(int i= 0; i< arr.length; i++){
            if(arr[i] != i+1 ) return i+1;
        }
        return -1;
    }
}
