/*
Problem Statement: Print All Substrings of a String

Write a program that prints all possible substrings of a given string.

Input

A single string s consisting of letters, digits, and/or special characters.

Output

Print each substring of s on a new line.

Substrings are continuous sequences of characters from the original string.

Include substrings of all possible lengths (from 1 to s.length()).

Example 1

Input:

s = "abc"


Output:

a
ab
abc
b
bc
c


Explanation:

Substrings of length 1: "a", "b", "c"

Substrings of length 2: "ab", "bc"

Substring of length 3: "abc"

Example 2

Input:

s = "xy"


Output:

x
xy
y


Explanation:

Substrings of length 1: "x", "y"

Substring of length 2: "xy"

💡 Notes

A string of length n has exactly n*(n+1)/2 substrings.

Substrings are continuous, not to be confused with subsequences (which may skip characters
 */
package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string :");
        String str = sc.nextLine();
        printAllSubstring(str);

    }
    public static void printAllSubstring(String str){
        int n= str.length();
        for(int i=0; i< n; i++){
            for(int j = i+1;j<= n; j++){
                String subString = str.substring(i,j);
                System.out.println(subString);
            }
        }
    }
}
