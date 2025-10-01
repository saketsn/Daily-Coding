/*
Problem: Replace Most Frequent Character

Description:
You are given a string str and a character c. Your task is to find the character in
the string that appears most frequently and replace all its occurrences with the given character c.

If multiple characters have the same highest frequency, replace the first one encountered with the maximum frequency.

Input: str = "bbadbbababb", c = 't'
Output: "ttadtattatt"
Explanation: 'b' is the most frequent character. All 'b's are replaced with 't'.
 */

package AccentureQuestion.src;

import java.util.Scanner;

public class ReplaceFreqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.print("Enter the character :");
        char ch = sc.next().charAt(0);
        System.out.println(str);
        System.out.println("Ater the replacement the output is : "+ result(str, ch));
    }

    public static String result(String str){
        if(str == null || str.isEmpty()) return str;
    }

}
