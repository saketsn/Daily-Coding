package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class StringContainsOnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string :");
        String str = sc.nextLine();
        System.out.println("The given string only contain digit : "+isDigit(str));
    }

    public static boolean isDigit(String str){
        str = str.trim();
        boolean digit = true;
        for(char c : str.toCharArray()){
            if(!(c - '0' >= 0 && c - '0' <= 9)){
                digit = false;
                break;
            }
        }
        return digit;
    }
}
