/*
Rearrangement Of Bits

Alex Gives You a positive Number N and wants you to rearrange the
bits of the number in its binary representation such that all set bits
are in consecutive order. Your task is to find and return an integer value
representing the minimum possible number that can be formed after re-arranging the bits of the number N.

Example

Input1: 10
Output: 3
Explanation: 10 -> binary: 1010 count the set bits and arrange in consecutive order such as 0011 which in decimal is 3.

Input: 2
Output: 1
*/
package AccentureQuestion.src;

import java.util.Scanner;

public class Rearrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Output is = " + result(n));
    }

    public static int result(int n) {
        // Count set bits
        int count = Integer.bitCount(n);

        // Smallest number with count set bits is (2^count - 1)
        return (1 << count) - 1;
    }
}

