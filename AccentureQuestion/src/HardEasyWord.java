/*
 String Difficulty Quotient
Problem Statement:
Implement the function: int Difficulty(char str[], int len);
The function accepts a string ‘str’ of length ‘len’ containing
space-separated words. A word is ‘hard’ if it meets at least one of these conditions:

There are more consonants than vowels.

There are 3 consecutive consonants.
Otherwise, the word is ‘easy’.
Implement the function to find and return the difficulty quotient of the string, calculated as:
Difficulty quotient = (5 * hard) – (2 * easy) where hard is the count of hard words and easy is the count of easy words.

Notes:

Return 0 if the string is null.

The string contains only lower-case alphabets and spaces.

Vowels are {a, e, i, o, u}.

Example:

Input: str: "qiewldoaa life ace by fantasy"

Output: 11

Explanation:

qiewldoaa: Hard

life: Easy

ace: Easy

by: Hard

fantasy: Hard

Hard words = 3, Easy words = 2.

Quotient = (5 * 3) - (2 * 2) = 15 - 4 = 11.
 */
package AccentureQuestion.src;

import java.util.Scanner;

public class HardEasyWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a String : ");
        String str = sc.nextLine();
        System.out.println("Difficulty  quotient is = "+ Difficulty(str));

    }

    public static int Difficulty(String str){
        if(str == null || str.trim().isEmpty()) return 0;
        int hard = 0;
        int easy = 0;
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] st = str.split(" ");
        for(int i=0; i< st.length; i++){
            int temp = cal(st[i]);
            if(temp == 1){
                hard++;
            }
            if(temp == 0) easy++;
        }
        int quotient = (5*hard) - (2*easy);
        return quotient;

    }

    public static int cal(String word){
        int result = 0; // 0 = easy
        int vowel=0;
        int cons = 0;
        word = word.toLowerCase();
        for(int i=0; i < word.length(); i++){
            char ch = word.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                vowel++;
            }else{
                cons++;
            }


        }

        for(int i=0; i< word.length()-2; i++){
            char ch = word.charAt(i);
            char ch1 = word.charAt(i+1);
            char ch2 = word.charAt(i+2);
            if((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') &&
                    (ch1 != 'a' && ch1 != 'e' && ch1 != 'i' && ch1 != 'o' && ch1 != 'u') &&
                    (ch2 != 'a' && ch2 != 'e' && ch2 != 'i'&& ch2 != 'o' && ch2 != 'u')){
                result = 1;

            }
        }

        if(cons > vowel){
            result = 1;
        }
        return result;
    }
}
