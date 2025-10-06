/*
Create a program to identify the index of the first repeating element in an array of integers,
where the first occurrence of the repeating element has the smallest index.
Example:
Input: arr[] = {10, 5, 3, 4, 3, 5, 6}
Output: 5
Explanation: 5 is the first element that repeats
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatingElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The first repeating Element is : "+ result(arr));
    }
    public static int result(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        int firstRepeat = -1;

        // Traverse from end to start
        for(int i = arr.length - 1; i >= 0; i--) {
            if(set.contains(arr[i])) {
                firstRepeat = arr[i]; // last seen in reverse = first repeating in normal order
            } else {
                set.add(arr[i]);
            }
        }

        return firstRepeat;
    }
}
