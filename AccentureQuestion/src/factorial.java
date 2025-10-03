/*
Of course! Here are the programming questions from the content you provided.

1. Factorial
Problem Statement:
Given an integer value as input, return the factorial value of the given number as a string.
Accept the integer as input from the user and display the factorial of the given number.

Constraints:

1≤N≤100

Example:

Input: 5

Output: 120

Input: 10

Output: 3628800
 */
package AccentureQuestion.src;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to get the factorial :");
        int n = sc.nextInt();
        String st = "";
        st = st+fact(n);

        System.out.print("The factorial of given number "+ n+ " is : "+ st);
    }
    public static int fact(int n){
        String st = "";
        if(n== 0) return 1;
        return n * fact(n-1);
    }
}
