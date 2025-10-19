/*
Problem Statement: Print Duplicate Characters in a String

Description:
Given a string s, write a program to find and print all the characters that appear
more than once in the string. The comparison should be case-sensitive, meaning 'A' and 'a'
are considered different characters.

Input:

A non-empty string s containing only printable characters.

Output:

Print each duplicate character and the number of times it appears in the string.

Characters should be printed in the order they first appear in the string.

Example 1:

Input:  "programming"
Output:
g : 2
r : 2
m : 2


Example 2:

Input:  "Mississippi"
Output:
s : 4
i : 4
p : 2


Constraints:

The input string will not be empty.

Only printable ASCII characters will be used.
 */
package StringQuestions.EasyLevel20Qs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        result(str);
    }
    public static void result(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey()+ " : "+ entry.getValue());
            }
        }
    }
}
