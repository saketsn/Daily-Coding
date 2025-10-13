/*
Problem: Rotated String
Problem Statement
You are given two strings, s1 and s2. Your task is to determine if s2 is a rotation of s1.

A string s2 is considered a rotation of s1 if s2 can be obtained by taking a prefix of s1 and
 moving it to the end. For example, if s1 = "waterbottle", then "erbottlewat" is a rotation of s1.

You must return true if s2 is a rotation of s1, and false otherwise.

Examples
Example 1:

Input: s1 = "abcde", s2 = "cdeab"

Output: true

Explanation: s2 can be formed by moving the prefix "ab" from the beginning of s1 to the end.

Example 2:

Input: s1 = "coder", s2 = "ercod"

Output: true

Explanation: s2 can be formed by moving the prefix "cod" from the beginning of s1 to the end.

Example 3:

Input: s1 = "hello", s2 = "ohell"

Output: true

Explanation: This is a rotation where the prefix "hell" is moved to the end of the remaining character "o", or more simply, "h" is moved to the end of "ello".

Example 4:

Input: s1 = "abc", s2 = "acb"

Output: false

Explanation: s2 is an anagram of s1, but it cannot be obtained by a circular shift (rotation) of s1's characters.

Constraints
The lengths of s1 and s2 will be between 0 and 2000, inclusive.

The strings will consist of lowercase English letters ('a'-'z').

An empty string is considered a rotation of itself.
 */
package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class RotatedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string :");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd string :");
        String str2 = sc.nextLine();
        System.out.println("The given two string is isRotate : "+ isRotate(str1, str2));
    }
    public static boolean isRotate(String str1,  String str2){
         if(str1.length() != str2.length()) return false;

         String dstr = str1+str1;
         return dstr.contains(str2);
    }
}
