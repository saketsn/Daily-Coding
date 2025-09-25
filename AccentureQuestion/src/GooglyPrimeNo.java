/*
Problem Statement

A number whose sum of digits is prime.

Input: 43
Output: YES (4+3 = 7)

Input: 123
Output: NO (1+2+3 = 6)

*/

package AccentureQuestion.src;

import java.util.Scanner;

public class GooglyPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = sc.nextInt();

        System.out.println("the given number digit sum is prime :"+ isPrime(n));
    }

    private static boolean isPrime(int n){
        int sum = 0;

        while(n>0){
            sum += n%10;
            n /=10;
        }
        for(int i=2; i<= sum/2; i++){
            if(sum%i == 0){
                return false;
            }
        }
        return true;
    }
}
