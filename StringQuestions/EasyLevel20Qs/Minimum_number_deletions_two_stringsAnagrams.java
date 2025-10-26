/*
Problem Statement

Given two strings, s1 and s2, your task is to find the minimum number of character deletions required to make the
two strings anagrams of each other.

Definition:
Two strings are anagrams if they contain the same characters with the same frequency, but possibly in a different order.

Rules:

You can only delete characters from either string.

You cannot add or replace characters.

Input:

Two strings s1 and s2 consisting of lowercase English letters.

Output:

An integer representing the minimum number of deletions required to make s1 and s2 anagrams.

Example 1:

Input: s1 = "cde", s2 = "abc"
Output: 4
Explanation:
Delete 'd' and 'e' from "cde" and delete 'a' and 'b' from "abc".
Resulting strings: "c" and "c", which are anagrams.


Example 2:

Input: s1 = "aabbcc", s2 = "abccdd"
Output: 4
Explanation:
Delete 'a' and 'b' from "aabbcc" and delete 'd' and 'd' from "abccdd".
Resulting strings: "abcc" and "abcc", which are anagrams.


Constraints:

1 <= len(s1), len(s2) <= 10^5

Strings contain only lowercase letters a–z.
 */
package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class Minimum_number_deletions_two_stringsAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string s :");
        String s = sc.nextLine();
        System.out.print("Enter the second string t :");
        String t = sc.nextLine();

        System.out.print("The minimum number of deletions is :"+ minDelete(s, t));
    }

    public static int minDelete(String s, String t){
        int n = s.length();
        int m = t.length();
        int count = 0;

        char[] arrs = new char[26];
        char[] arrt = new char[26];

        for(char c : s.toCharArray()){
            int index = c - 'a';
            arrs[index]++;
        }
        for(char c : t.toCharArray()){
            int index = c - 'a';
            arrt[index]++;
        }

        for(int i=0; i< 26; i++){
            if(arrs[i] ==0  && arrt[i] == 0){
                continue;
            }else{
                count += Math.abs(arrs[i] - arrt[i]);
            }
        }
        return count;
    }
}
