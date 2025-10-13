package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class RemoveAllWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.println("The String after removing all white spaces is : " + remove(str));
        System.out.println("The string after replacing all white spaces with %20 :"+ repl(str));
    }
    public static String remove(String str){
        str = str.trim();
        str = str.replaceAll("\\s+","");
        return str;
    }

    public static String repl(String str){
        String temp = ""+ str;
        temp = temp.replaceAll("\\s","%20");
        return temp;

    }
}
