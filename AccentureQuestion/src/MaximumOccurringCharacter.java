/*
Problem Understanding

You are given:

A string of characters (up to 10,000 characters).

You need to:

Count the frequency of each character in the string.

Find the character with the highest frequency.

Special case:

If more than one character has the same maximum frequency → output 0.

Step-by-Step Logic

Count characters:

Use an array or map to store how many times each character appears.

Example: "aabbbc" → a=2, b=3, c=1.

Find maximum frequency:

Loop through the frequency array/map to find the highest count.

Keep track of which character has that count.

Check for ties:

If another character has the same maximum count, return 0.

Otherwise, return the character with the max count.

Example 1
Input: "aabbbc"
Frequency:
a → 2
b → 3
c → 1

Max frequency → 3 (b)
Output: b
 */
package AccentureQuestion.src;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumOccurringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a group of characters :");
        String str = sc.nextLine();
        char result = findMaxOccurringChar(str);
        System.out.println("Maximum Occurring Character: " + result);
    }
    public static char findMaxOccurringChar(String str){
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int maxFreq = 0;
        char maxChar = '0';
        boolean tie = false;
        for(char ch : map.keySet()){
            int freq = map.get(ch);
            if(freq > maxFreq){
                maxFreq = freq;
                maxChar = ch;
                tie = false;
            }else if (freq == maxFreq) {
                tie = true; // tie found
            }
        }
        // If tie, return '0'
        if (tie) {
            return '0';
        } else {
            return maxChar;
        }
    }
}
