/*

Input:
A single line of text containing words separated by spaces.
The input string consists of only printable ASCII characters.

Output:
The string with words reversed in order.

Example:
Input: Hello
World

Output:
World Hello

*/
package AccentureQuestion.src;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a String :");
        String str = sc.nextLine();


        word(str);

    }
    public static void word(String str){
         str = str.trim();
         str = str.replaceAll("\\s+", " ");
         String[] res = str.split(" ");

        for(int i=res.length-1; i>=0; i--){
            System.out.print(res[i]+ " ");
        }
    }
}
