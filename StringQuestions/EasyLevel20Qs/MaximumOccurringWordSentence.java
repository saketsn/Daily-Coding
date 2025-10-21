/*
Problem: Maximum Occurring Word in a Sentence

Description:
Given a string sentence consisting of words separated by spaces, write a program to find
the word that occurs the maximum number of times in the sentence.

If there are multiple words with the same maximum frequency, return the first one that appears in the sentence.

The comparison should be case-insensitive if specified, or case-sensitive otherwise.

Example 1:

Input:

sentence = "the cat and the dog and the cat"


Output:

"the"


Explanation:

Word frequencies:

"the" → 3

"cat" → 2

"and" → 2

"dog" → 1

Maximum frequency is 3 → "the"
 */
package StringQuestions.EasyLevel20Qs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MaximumOccurringWordSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.println("The maximum occurring word in the given String is :"+ maxWord(str));
    }

    public static String maxWord(String str){
        Map<String, Integer> map = new LinkedHashMap<>();
        str = str.trim();
        String[] word = str.split("\\s+");
        for(String w : word){
            map.put(w, map.getOrDefault(w,0)+1);
        }
        int max = 0;
        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()){
              int tempfreq = entry.getValue();
              if(tempfreq > max){
                  max = tempfreq;
                  result = entry.getKey();
              }
        }

        return result;

    }

}
