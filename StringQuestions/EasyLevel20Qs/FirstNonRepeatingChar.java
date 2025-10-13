/*
Problem: First Non-Repeating Character
Problem Statement
Given a string s, your task is to find and return its first non-repeating character.
A non-repeating character is one that appears exactly once in the entire string.

If no such character exists (i.e., every character is repeated at least once),
you should indicate that a unique character was not found. The character comparison must be case-sensitive,
meaning 'a' and 'A' are considered distinct characters.

Examples
Here are a few examples to illustrate the requirement:

Example 1:

Input: s = "stress"

Output: 't'

Explanation: The character 's' is repeated. The first character that appears only once is 't'.

Example 2:

Input: s = "apple"

Output: 'a'

Explanation: 'a' is the very first character and it does not repeat.

Example 3:

Input: s = "abacabad"

Output: 'c'

Explanation: 'a' and 'b' both repeat. 'c' is the first character encountered that does not repeat later in the string.

Example 4:

Input: s = "aaaa"

Output: "No non-repeating character found." (or an equivalent indicator like a null character).

Explanation: Every character in the string is a repeat.

Constraints
You can assume the following constraints for your solution:

1 <= s.length <= 10^5

The string s will consist of lowercase English letters (a-z).
 */
package StringQuestions.EasyLevel20Qs;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        char result = nonRepeat(str);
        if(result == '\0'){
            System.out.println("No repeating character.");
        }else{
            System.out.print(result);
        }

    }

    public static char nonRepeat(String str){
        if(str == null || str.length() == 0) return '\0';
        str = str.toLowerCase().trim();
        str = str.replaceAll("\\s+","");
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch , map.getOrDefault(ch, 0)+1);
        }

        for(char ch : str.toCharArray()) {
            {
                if (map.get(ch) == 1) {
                    return ch;
                }
            }

        }

        return '\0';
    }
}
