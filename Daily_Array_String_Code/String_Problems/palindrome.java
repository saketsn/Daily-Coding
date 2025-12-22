/*
A palindrome is a string that reads the same forward and backward.
Examples: madam, level, radar
 */
package Daily_Array_String_Code.String_Problems;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        System.out.println("The String is palindrome  = "+ isPalindrome(str));
    }

    public static boolean isPalindrome(String str){
        int r= str.length()-1;
        int l = 0;
        while(l< r){
            if(str.charAt(l) != str.charAt(r)){
                return  false;
            }
            l++;
            r--;
        }
        return true;
    }
}
