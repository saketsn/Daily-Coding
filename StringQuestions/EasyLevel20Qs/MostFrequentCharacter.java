/*
Problem Statement: Find the Most Frequent Character in a String

Given a string s, your task is to find the character that appears most frequently in the string.
 The comparison should be case-sensitive, meaning 'A' and 'a' are considered different characters.

If there are multiple characters with the same highest frequency, return any one of them.
You may assume the input string is not empty and contains only printable characters.

Example 1:

Input:

s = "success"


Output:

Most frequent character: 's'


Explanation:
The character 's' appears 3 times, which is more than any other character.

Example 2:

Input:

s = "Mississippi"


Output:

Most frequent character: 's'


Explanation:
The character 's' appears 4 times, while 'i' appears 4 times as well — so returning either 's' or 'i' is acceptable.
 */

package StringQuestions.EasyLevel20Qs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        char result = freq(str);
        System.out.println("Most frequent character: '" + result + "'");
        System.out.println("Most frequent character: '" + secondFreq(str) + "'");
    }
    public static char freq(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int max = 0;
        char chMax = str.charAt(0);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if(freq > max){
                max = freq;
                chMax = entry.getKey();
            }
        }
        return chMax;
    }
    public static char secondFreq(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        int max1 = 0;
        int max2 = 0;
        char chMax1 = str.charAt(0);
        char chMax2 = str.charAt(0);
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            char ch = entry.getKey();;
            if(freq > max1){
                max2 = max1;
                chMax2 = chMax1;

                max1 = freq;
                chMax1 = ch;
            }else if(freq < max1 && freq > max2){
                max2 = freq;
                chMax2 = ch;
            }
        }
        return chMax2;
    }
}
