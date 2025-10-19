/*
Problem Statement: Remove All Occurrences of a Given Character from a String

Description:
Given a string s and a character ch, write a program to remove all occurrences of ch
from s and return the resulting string. The comparison should be case-sensitive, meaning 'A' and 'a'
are considered different characters.

Input:

A non-empty string s containing only printable characters.

A character ch that needs to be removed from the string.

Output:

The string after removing all occurrences of the character ch.

Example 1:

Input:  s = "banana", ch = 'a'
Output: "bnn"


Example 2:

Input:  s = "Mississippi", ch = 's'
Output: "Miiippi"


Constraints:

The input string will not be empty.

Only printable ASCII characters will be used.
 */
package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class RemoveCharFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.print("Enter a char :");
        char c = sc.nextLine().charAt(0);
        System.out.println(result(str,c));
    }
    public static String result(String str, char c){
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch != c){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
