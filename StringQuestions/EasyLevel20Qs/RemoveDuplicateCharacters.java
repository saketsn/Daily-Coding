/*
Problem Statement: Remove Duplicate Characters from a String

Write a program that removes all duplicate characters from a given string while preserving the order of their first occurrence.

Input

A single string s consisting of letters, digits, and/or special characters.

Output

A new string with all duplicate characters removed, keeping only the first occurrence of each character.

Example 1

Input:

s = "programming"


Output:

progamin


Explanation:
In the word "programming",

The first 'r' and 'g' are kept,

The second 'r' and 'g' are removed,

Similarly, the second 'm' and 'i' are removed.
So, the final string is "progamin".
 */
package StringQuestions.EasyLevel20Qs;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string :");
        String str = sc.nextLine();
        System.out.println("The String after removing duplicate character is : "+ revome(str));
    }

    public static String revome(String str){
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : str.toCharArray()){
            set.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for(char c : set){
            sb.append(c);
        }
        return sb.toString();
    }
}
