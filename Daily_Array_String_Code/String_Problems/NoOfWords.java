/*
Find the number of words in a string
 */
package Daily_Array_String_Code.String_Problems;

import java.util.Scanner;

public class NoOfWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        System.out.println("Number of words in the given String is = "+ words(str));
    }

    private static int words(String str){
        String[] senc = str.trim().split("\\s+");
        return senc.length;
    }
}
