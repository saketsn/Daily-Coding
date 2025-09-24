/*

Encode the Number:
You work in the message encoding department of a national security
message agency. Every message that is sent from or received in your
office is encoded. You have an integer N and each digit of N is squared
and the squares are concatenated  together to encode the original
number. Your task is to find and return an integer value representing
the encoded value of the number.

Input Specification:
input1: An integer value N representing the number to be encoded.

Explanation:
Output Specification:
Return an integer value representing the encoded value of the number.

Example 1:
input1: 34
Output: 916

Here, the given integer is 34, and the square its digit are:
3^2= 9
4²=16

*/

package AccentureQuestion.src;

import java.util.Scanner;

public class EncodeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of encoding :");
        int num = sc.nextInt();

        System.out.println("The encoded value of given number "+ num+ " is :"+ encode(num));

    }

    private static int encode(int num){
        int cn = num;
        String st = "";

        while(cn > 0){
            int x = cn%10;
            st = (x*x)+st;
            cn /= 10;
        }

        int result = Integer.parseInt(st);
        return  result;
    }

}
