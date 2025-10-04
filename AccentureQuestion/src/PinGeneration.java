/*
PIN Generation
Problem Statement:
Complete the following function: int makePin(int seed1, int seed2, int seed3)
The function takes three 3-digit numbers as input. The PIN is a 4-digit number created as follows:

Fourth digit (thousands place): The largest digit among all digits of the three seeds.

Third digit (hundreds place): The largest of the first digits of each seed.

Second digit (tens place): The largest of the second digits of each seed.

First digit (units place): The largest of the third digits of each seed.

Constraints:

100 <= seed1, seed2, seed3 <= 999

Example:

Input: seed1 = 123, seed2 = 345, seed3 = 289

Output: 9389

Explanation:

Units digit: max(3, 5, 9) = 9

Tens digit: max(2, 4, 8) = 8

Hundreds digit: max(1, 3, 2) = 3

Thousands digit: The largest digit of all is 9.

Result: 9389
 */
package AccentureQuestion.src;



import java.util.Scanner;

public class PinGeneration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 digit number as seed1 for Pin Generation = ");
        int seed1 = sc.nextInt();
        System.out.print("Enter 3 digit number as seed2 for Pin Generation = ");
        int seed2 = sc.nextInt();
        System.out.print("Enter 3 digit number as seed3 for Pin Generation = ");
        int seed3 = sc.nextInt();

        System.out.println("The generated PIN is = " + pin(seed1, seed2, seed3));
    }

    public static int pin(int seed1, int seed2, int seed3) {
        // extract digits of each seed
        int s1_first = seed1 / 100;
        int s1_second = (seed1 / 10) % 10;
        int s1_third = seed1 % 10;

        int s2_first = seed2 / 100;
        int s2_second = (seed2 / 10) % 10;
        int s2_third = seed2 % 10;

        int s3_first = seed3 / 100;
        int s3_second = (seed3 / 10) % 10;
        int s3_third = seed3 % 10;

        // PIN digits
        int units = Math.max(s1_third, Math.max(s2_third, s3_third));
        int tens = Math.max(s1_second, Math.max(s2_second, s3_second));
        int hundreds = Math.max(s1_first, Math.max(s2_first, s3_first));

        // thousands = largest among all digits of all seeds
        int thousands = Math.max(
                Math.max(Math.max(s1_first, Math.max(s1_second, s1_third)),
                        Math.max(s2_first, Math.max(s2_second, s2_third))),
                Math.max(s3_first, Math.max(s3_second, s3_third))
        );

        // build the final 4-digit pin
        int pin = thousands * 1000 + hundreds * 100 + tens * 10 + units;
        return pin;
    }
}
