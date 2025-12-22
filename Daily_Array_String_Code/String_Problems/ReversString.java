/*
Reverse a string without using built-in functions

 */
package Daily_Array_String_Code.String_Problems;


import java.util.Scanner;

public class ReversString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        System.out.println("The String after revers is = "+ reverse(str));
    }

    public static String reverse(String str){
        char[] chars = str.toCharArray();
        int l=0, r= chars.length-1;
        while(l<r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        String result = new String(chars);
        return result;
    }
}
