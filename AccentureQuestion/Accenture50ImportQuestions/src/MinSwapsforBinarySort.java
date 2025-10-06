/*
Formulate a program to sort a binary array with the objective of minimizing the number of
swaps. The program should adhere to the constraint that only adjacent elements are
permissible for swapping.
Example:
Input : [0, 0, 1, 0, 1, 0, 1, 1]
Output : 3
1st swap : [0, 0, 1, 0, 0, 1, 1, 1]
2nd swap : [0, 0, 0, 1, 0, 1, 1, 1]
3rd swap : [0, 0, 0, 0, 1, 1, 1, 1]
Input : Array = [0, 1, 0, 1, 0]
Output : 3
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.Scanner;

public class MinSwapsforBinarySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of the array :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The number of swap needed = " + swap(arr));
    }
    public static int swap(int[] arr){
        int n = arr.length;
        int count1 = 0;
        int countSwap = 0;
        for(int i=0; i< n; i++){
            if(arr[i] == 1){
                count1++;
            }
            if(arr[i] == 0){
                countSwap += count1;
            }
        }
        return countSwap;
    }
}
