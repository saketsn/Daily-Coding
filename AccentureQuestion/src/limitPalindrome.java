/*
Question: Write a program in C such that it takes a lower limit and upper limit as inputs and print all the intermediate palindrome numbers.

Test Cases:

TestCase 1:
Input :
10 , 80
Expected Result:
11 , 22 , 33 , 44 , 55 , 66 , 77.

Test Case 2:
Input:
100,200
Expected Result:
101 , 111 , 121 , 131 , 141 , 151 , 161 , 171 , 181 , 191.

*/

package AccentureQuestion.src;

import java.util.Scanner;

public class limitPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the lower limit number : ");
        int lower = sc.nextInt();

        System.out.print("Enter the upper limit number : ");
        int upper = sc.nextInt();
        System.out.println("The number between " + lower+ " and " + upper + " which are palindrome is : ");
        for(int i= lower+1; i< upper; i++){
            if(i == sol(i) ){
                System.out.print(i + " ");
            }
        }


    }

    private static int sol(int n){

        int rem = 0;

        while(n > 0){
            rem = rem*10 + n% 10;
            n /= 10;

        }
        return rem;

    }
}
