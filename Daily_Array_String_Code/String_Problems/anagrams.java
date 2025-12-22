/*
Question: Check if Two Strings Are Anagrams
Definition

Two strings are said to be anagrams if they contain the same characters with the same frequency, but the order of characters is different.

Problem Statement

Given two strings, determine whether they are anagrams of each other.

Examples

Example 1
Input:
String 1: "listen"
String 2: "silent"

Output:
True

Explanation:
Both strings contain the same characters (l, i, s, t, e, n) with equal frequency.
 */
package Daily_Array_String_Code.String_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String 1 :");
        String str1 = sc.nextLine();
        System.out.println("Enter a String 2 :");
        String str2 = sc.nextLine();
        System.out.println("The given strings are Anagrams = "+ isAnagrams(str1, str2));
    }

    private static boolean isAnagrams(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

}
