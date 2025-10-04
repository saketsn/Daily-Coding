/*
 Special String Reverse
Problem Statement:
You are given a function, char* ReverseString(char* s);
The function accepts a string 's' that contains alphabets ('a' to 'z' and 'A' to 'Z') along with other characters.
Reverse this string 's' in such a way that only alphabets are reversed and other characters are not affected.

Note:

Return null if s is null.

Example 1:

Input: a^bk$c

Output: c^kb$a

Example 2:

Input: $A5b*ntp^

Output: $p5t*nbA^
 */
package AccentureQuestion.src;

import java.util.Scanner;

public class SpecialStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with special characters :");
        String str = sc.nextLine();
        System.out.print("Input string is : "+ str);
        System.out.println();
        System.out.println("The reverse String is : "+ rev(str));

    }
    public static String rev(String str){
        str = str.trim();
        if(str == null) return null;
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(!Character.isLetter(arr[left])){
                left++;
            }else if(!Character.isLetter(arr[right])){
                right--;
            }else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
