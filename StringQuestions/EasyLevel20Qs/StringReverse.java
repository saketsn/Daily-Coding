package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.println("The reverse of the given string is : "+ rev(str));
        System.out.println("The given string is palindrome :"+ isPalindrome(str));
    }
    public static String rev(String str){
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1; i>= 0; i--){
            char ch = str.charAt(i);
            sb.append(ch);
        }

        return sb.toString();
    }

    public static boolean isPalindrome(String str){
        String p = rev(str);
        return p.equals(str);
    }
}
