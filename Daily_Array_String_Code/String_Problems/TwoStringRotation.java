/*
✅ Problem Statement

Check if two strings are rotations of each other

Given two strings s1 and s2, check whether s2 is a rotation of s1.

A string is said to be a rotation of another string if it can be obtained by rotating the original string any number of times.

🧪 Examples

Example 1

Input:
s1 = "abcd"
s2 = "cdab"

Output:
true


Example 2

Input:
s1 = "abcd"
s2 = "acbd"

Output:
false

📌 Constraints
1 ≤ length of s1, s2 ≤ 10^5

💡 Intuition (Very Important)

If s2 is a rotation of s1, then:

👉 s2 must be a substring of s1 + s1

Why?

All possible rotations of s1 are contained inside s1 + s1.

Example:

s1 = "abcd"
s1 + s1 = "abcdabcd"

Possible rotations:
abcd
bcda
cdab
dabc
 */
package Daily_Array_String_Code.String_Problems;

import java.util.Scanner;

public class TwoStringRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String1 :");
        String str1 = sc.nextLine();
        System.out.println("Enter a String2 :");
        String str2 = sc.nextLine();
        System.out.println("Given two string is rotation of each other = " + rotation(str1, str2));
    }

    public static boolean rotation(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        String temp = str1 + str1;

        return temp.contains(str2);
    }
}
