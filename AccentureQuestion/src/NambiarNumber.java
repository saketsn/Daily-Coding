/*
 Number Integration and Disintegration (The "Nambiar Number" Generator)
Problem Statement:
M.Nambiar has devised a mechanism to process any given mobile number and thus generate a new resultant number.
He calls this mechanism the "Nambiar Number Generator" and the resultant number is referred to as the "Nambiar Number".
The mechanism is as follows: in the given mobile number, starting with the first digit, keep on adding all subsequent

digits till the state (even or odd) of the sum of the digits is opposite to the state (odd or even) of the first digit.
Continue this from the subsequent digit till the last digit of the mobile number is reached. Concatenating the sums thus
generated results in the Nambiar Number.

Notes:

The number of passes required to process the given number may vary.

0 should be considered an even number.

Example 1:

Input: 9880127431

Output: 26971

Explanation:

Pass 1: Starts with 9 (odd). Sum until the result is even. 9+8+8+0+1 = 26 (even). Result is 26.

Pass 2: Starts with the next digit, 2 (even). Sum until the result is odd. 2+7 = 9 (odd). Result is 9.

Pass 3: Starts with 4 (even). Sum until the result is odd. 4+3 = 7 (odd). Result is 7.

Pass 4: Starts with 1 (odd). It's the last digit. Result is 1.

Concatenated result: 26971.

Example 2:

Input: 9860857152

Output: 3687

Explanation:

Pass 1: 9+8+6+0+8+5 = 36.

Pass 2: 7+1 = 8.

Pass 3: 5+2 = 7. (Stops because it's the end of the number).

Concatenated result: 3687.

Example 3:

Input: 8123454210

Output: 95970

Example 4:

Input: 9900114279

Output: 181149
 */
package AccentureQuestion.src;

import java.util.Scanner;

public class NambiarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 10 digit mobile number: ");
        String n = sc.next();
        System.out.print("The Nambiar Number of given number " + n + " is = " + num(n));
    }

    public static String num(String n) {
        String str = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            int sum = 0;
            int x = str.charAt(i) - '0'; // starting digit
            int k = i; // track index where we stop
            boolean found = false; // track if opposite parity found

            if (x % 2 == 0) { // even start → sum until odd
                for (int j = i; j < str.length(); j++) {
                    int y = str.charAt(j) - '0';
                    sum += y;
                    if (sum % 2 != 0) { // found opposite (odd)
                        k = j;
                        sb.append(sum);
                        found = true;
                        break;
                    }
                }
            } else { // odd start → sum until even
                for (int j = i; j < str.length(); j++) {
                    int y = str.charAt(j) - '0';
                    sum += y;
                    if (sum % 2 == 0) { // found opposite (even)
                        k = j;
                        sb.append(sum);
                        found = true;
                        break;
                    }
                }
            }

            // if never found opposite, still append sum (end of number case)
            if (!found) {
                sb.append(sum);
                k = str.length() - 1;
            }

            i = k + 1; // move to next pass
        }

        return sb.toString();
    }
}