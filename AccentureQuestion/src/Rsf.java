/*
Two-digit "Reduced Subtracted Form"
Problem Statement:
Given a number, you are expected to find its two-digit "Reduced Subtracted Form (RSF)".
The RSF of a number can be found by concatenating the absolute difference between its adjacent digits.
To find the two-digit RSF, we need to continue this process until the resultant RSF is a two-digit number.

Notes:

Input will always be >= 100.

Use absolute values for differences.

The input values are designed such that a two-digit RSF is possible.

Example 1:

Input: 6928

Output: 41

Explanation:

RSF of 6928 is |6-9||9-2||2-8| which is 376.

Since 376 is not a two-digit number, repeat the process.

RSF of 376 is |3-7||7-6| which is 41.

41 is a two-digit number, so the process stops.

Example 2:

Input: 5271

Output: 21

Explanation:

RSF of 5271 is 356.

RSF of 356 is 21.
 */
package AccentureQuestion.src;

import java.util.Scanner;

public class Rsf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String str = sc.nextLine();

        System.out.println("RSF of the given number "+ str+ " is = "+ convert(str));
    }

    public static int convert(String str) {

        while(str.length()>2) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length() - 1; i++) {
                int x = str.charAt(i) - '0';
                int y = str.charAt(i + 1) - '0';
                int temp = Math.abs(x - y);
                sb.append(temp);
            }
            str = sb.toString();
        }


        return Integer.parseInt(str);
    }
}
