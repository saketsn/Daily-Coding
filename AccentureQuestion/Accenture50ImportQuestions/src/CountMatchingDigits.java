/*
Compose a program to determine the count of matching digits at corresponding indices in two
given numbers, denoted as N and M.
Example:
Input: N = 123, M = 321
Output: 1
Explanation: Digit 2 satisfies the condition
Input: N = 123, M = 111
Output: 1
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.Scanner;

public class CountMatchingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd number : ");
        int y = sc.nextInt();

        System.out.println("The count of matching digits at corresponding indices is = "+ count(x, y));
    }
    public static int count(int x, int y){
        String str1 = ""+x;
        String str2 = ""+y;
        int count = 0;
        int size =0;
        if(str1.length() < str2.length()){
            size =  str1.length();
        }else{
            size = str2.length();
        }
        for(int i=0; i< size; i++){
            if(str1.charAt(i)-'0' == str2.charAt(i)-'0'){
                count++;
            }
        }
        return count;
    }
}
