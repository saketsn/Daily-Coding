/*
Problem Statement

You are working on a financial analysing tool which repersents daily stock
price of a company over time Each element in an integer array A of size N
reperesnts the closing price of the stock for that particular day.
Your task is to find and return an integer value representing the total number of
days where the stock marke price decreased indicating negative growth.

Input: N = 6, A[] = {2,3,1,4,5,2}
Output: 2

Input: N = 1, A[] = {6}
Output: 0

*/
package AccentureQuestion.src;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeStockPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        System.out.println("Enter the element of the array : ");
        int[] arr = new int[n];
        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Total number of negative stock price count is = "+ count(arr));
    }
    public static int count(int[] arr){
        int c=0;
        for(int i=0; i< arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                c++;
            }
        }
        return c;
    }
}
