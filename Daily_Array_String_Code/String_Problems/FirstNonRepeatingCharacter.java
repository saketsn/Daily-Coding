/*
Question: Find the First Non-Repeating Character in a String

Problem Statement:
Given a string, find and return the first character that does not repeat anywhere else in the string.
If all characters repeat, return an appropriate indication (for example, “no non-repeating character”).

🔍 Explanation

A non-repeating character is a character that appears exactly once in the string.

“First” means the character that appears earliest from left to right in the string.

🧪 Example 1

Input:

swiss


Analysis:

s → appears multiple times

w → appears only once

i → appears only once

s → repeats

Output:

w


➡️ w is the first non-repeating character.
 */
package Daily_Array_String_Code.String_Problems;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String  :");
        String str = sc.nextLine();
        System.out.println(str);
        char ch = nonChar(str);
        System.out.println("The first non Repeating Character is : "+ ch);
    }
    public static char nonChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch : str.toCharArray()){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return '\0';
    }

    //Find the first repeating character in a string
    public static char repChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch : str.toCharArray()){
            if(map.get(ch) > 1){
                return ch;
            }
        }
        return '\0';
    }

}
