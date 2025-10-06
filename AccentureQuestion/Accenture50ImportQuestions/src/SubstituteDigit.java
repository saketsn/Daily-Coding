/*
In the context of a numerical scenario, formulate a program to substitute a specified digit,
denoted as d1, with another digit, denoted as d2, in a given number x.
Example:
Input : x = 645, d1 = 6, d2 = 5
Output : 545
We replace digit 6 with 5 in number 645.
Input  : x = 746, d1 = 7, d2 = 8
Output : 846
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.Scanner;

public class SubstituteDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int x = sc.nextInt();
        System.out.print("Enter the value of d1 :");
        int d1 = sc.nextInt();
        System.out.print("Enter the value of d2 :");
        int d2 = sc.nextInt();
        System.out.println("The number after substitution is : "+ subt(x, d1, d2));
    }

    public static int subt(int x, int d1, int d2){
        String str = ""+ x;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i< str.length(); i++){
            int ch = str.charAt(i)-'0';
            if(ch == d1){
                sb.append(d2);
            }else{
                sb.append(ch);
            }

        }

        String result = sb.toString();
        return Integer.parseInt(result);
    }
}
