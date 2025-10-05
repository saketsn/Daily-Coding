/*
Loose Lines to Tight Lines
Problem Statement:
Given a string, remove all additional spaces between words to align the text.
This is converting "loose lines" (with stretched spaces) to "tight lines" (with single spaces).

Input: A string with a maximum of 200 characters.
Output: The string with all extra spaces between words removed.

Example:

Input: "The  word   learning is  used  routinely  in discussions  about  teaching in   higher education"

Output: "The word learning is used routinely in discussions about teaching in higher education"


 */
package AccentureQuestion.src;

import java.util.Scanner;

public class LooseLIne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println("String after removing extra space is :" + rem(str));
    }
    public static String rem(String str){
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }
}
