/*
 Given Below is the cross pattern that has the shape of the mathematical cross
sign(X).
Print pattern For n=5
*
*
*
*  *
*
*   *
*
Example:
Input : 5
Output:
*
*
*
*  *
*
*   *
*
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.Scanner;

public class xPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        print(n);

    }
    public static void print(int n){
        for(int i=0; i< n; i++){
            for(int j=0; j< n; j++){
                if(i==j || j== n-i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
