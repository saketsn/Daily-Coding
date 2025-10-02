/*

Write a function SmallLargeSum(array) which accepts the array as an argument or parameter,
that performs the addition of the second largest element from the even location with the
second largest element from an odd location?
Rules:
a. All the array elements are unique.
b. If the length of the array is 3 or less than 3, then return 0.
c. If Array is empty then return zero.

Sample Test Case 1:
Input:
6
3 2 1 7 5 4
Output:
7

Explanation: The second largest element in the even locations (3, 1, 5) is 3.
The second largest element in the odd locations (2, 7, 4) is 4. So the addition
of 3 and 4 is 7. So the answer is 7.

Sample Test Case 2:
Input:
7
4 0 7 9 6 4 2
Output:
10

*/
package AccentureQuestion.src;

import java.util.Arrays;
import java.util.Scanner;

public class SmallLargeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of 2nd largest element at even and odd positon is : " + sum(arr));

    }

    public static int sum(int[] arr){
        int n= arr.length;
        int even = 0;
        int e1st = Integer.MIN_VALUE;
        int e2nd = Integer.MIN_VALUE;
        int o1st = Integer.MIN_VALUE;
        int o2nd = Integer.MIN_VALUE;

        for(int i=0; i< n; i += 2){
            if(arr[i] > e1st){
                e2nd = e1st;
                e1st = arr[i];
            }else if(arr[i] > e2nd && arr[i] < e1st){
                e2nd = arr[i];
            }
        }
        for(int i=1; i< n; i += 2){
            if(arr[i] > o1st){
                o2nd = o1st;
                o1st = arr[i];
            }else if(arr[i] > o2nd && arr[i] < o1st){
                o2nd = arr[i];
            }
        }
        return e2nd+ o2nd;
    }
}
