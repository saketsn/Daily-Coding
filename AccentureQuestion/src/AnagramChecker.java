/*
Problem Understanding

Definition of Anagram:
Two strings are anagrams if they contain the same characters with the same frequency, but possibly in a different order.

Case-sensitive: Usually, "Listen" and "Silent" are anagrams if case is ignored, but "Listen" ≠ "silent" if case is considered.

Spaces: Usually ignored unless stated otherwise.
 */
package AccentureQuestion.src;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not a Anagram");
        }

        sc.close();
    }
    public static boolean isAnagram(String str1, String str2){
        HashMap<Character, Integer> freq1  = new HashMap<>();
        HashMap<Character, Integer> freq2 = new HashMap<>();

        for(char ch : str1.toCharArray()){
            freq1.put(ch, freq1.getOrDefault(ch, 0)+1);
        }
        for(char ch : str2.toCharArray()){
            freq2.put(ch, freq2.getOrDefault(ch, 0)+1);
        }

        return freq1.equals(freq2);
    }
}
