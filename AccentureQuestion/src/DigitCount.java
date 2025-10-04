/*
. Count Digit Occurrences
Problem Statement:
You are required to implement the following function: Int CountDigitOccurrences(int l, int u, int x);
The function accepts 3 positive integers ‘l’, ’u’ and ‘x’ as its arguments. You are required to calculate
the number of occurrences of a digit ‘x’ in the digits of numbers lying in the range between ‘l’ and ’u’
(both inclusive), and return the same.

Note:

l <= u

0 <= x <= 9

Example 1:

Input: l: 2, u: 13, x: 3

Output: 2

Explanation: The digit 3 occurs in the numbers 3 and 13.

Example 2:

Input: l: 1, u: 30, x: 2

Output: 12
 */
package AccentureQuestion.src;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit of range :");
        int l = sc.nextInt();
        System.out.print("Enter the upper limit of range :");
        int u = sc.nextInt();
        System.out.print("Enter a number : ");
        int x = sc.nextInt();

        System.out.println("The number of x digit " + x + " occure between " + l+ " and "+u+ " is : "+ countx(l,u,x));

    }
    public static int countx(int l, int u, int x){
        int count = 0;
        for(int i=l; i<= u; i++){
            // Special case for number 0
            if (i == 0 && x == 0) {
                count++;
                continue;
            }
            int temp = i;
            while(temp > 0) {

                if (temp % 10 == x) {
                    count++;
                }
                temp /= 10;
            }
        }
        return count;
    }
}
