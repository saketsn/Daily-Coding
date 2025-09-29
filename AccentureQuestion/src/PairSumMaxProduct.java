/*

Given Array of size N, We have to return the pair whose sum is equal to target and having maximum product.

Note: First value of pair must be greater than the second value

Input: Target: 18
       N = 8
       arr = [11,1,2,8,10,11,15,7]

Output: [10, 8]  Sum is 18 and product is 80 which is maximum

*/
package AccentureQuestion.src;

import java.util.Arrays;
import java.util.Scanner;

public class PairSumMaxProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array : ");
        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the target value :");
        int target = sc.nextInt();
        result(arr, target);
    }
    public static void result(int[] arr, int target){
        int n= arr.length;
        int a = 0;
        int b= 0;
        int max = 0;
        for(int i=0; i< n; i++){
            for(int j=0; j<n; j++){
                if(arr[i] + arr[j] == target){
                     a = arr[i];
                    b= arr[j];
                    if(a*b > max){
                        max = a*b;
                    }
                }

            }
        }
        System.out.println("["+a+", "+b+"]" + " are the element and there max product is : "+ max);
    }

}
