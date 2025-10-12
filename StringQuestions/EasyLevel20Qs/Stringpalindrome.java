package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class Stringpalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.println("The reverse of the given string is : " + isPalalindrome(str));

    }

    public static boolean isPalalindrome(String str) {
        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
