/*
Problem Statement

Given a string S consisting of words and spaces, return the lenght of the last word in the string.

Input: "  I am  a passionate   Developer  "
Output: 9

*/

package AccentureQuestion.src;

import java.util.*;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String input = sc.nextLine();

        System.out.println("The length of last word of given String is = "+ word(input));
        System.out.println("The longest word :" + longestword(input));
    }

    private static int word(String input){

        String[] str = input.split(" ");

        String res = str[str.length-1];
        return res.length();
    }

    private static String longestword(String input){
        input = input.trim();
        input = input.replaceAll("\\s+", " ");
        String[] str = input.split(" ");

        StringBuilder sb = new StringBuilder();
        int max = str[0].length();
        int index = 0;
        for(int i=0; i< str.length; i++){
            if(str[i].length() > max){
                max = str[i].length();
                index = i;
            }
        }
        return str[index];
    }
}
