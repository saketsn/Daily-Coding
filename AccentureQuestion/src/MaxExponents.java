/*

Problem Statement               (Asked in Accenture Offcampus 2 Aug 2021, Slot 2)

You are given a function,

Int MaxExponents (int a , int b);

You have to find and return the number between ‘a’ and ‘b’ ( range inclusive on both ends) which has the maximum exponent of 2.

The algorithm to find the number with maximum exponent of 2 between the given range is

Loop between ‘a’ and ‘b’. Let the looping variable be ‘i’.
Find the exponent (power) of 2 for each ‘i’ and store the number with maximum exponent of 2 so
faqrd in a variable , let say ‘max’. Set ‘max’ to ‘i’ only if ‘i’ has more exponent of 2 than ‘max’.
Return ‘max’.
Assumption: a <b

Note: If two or more numbers in the range have the same exponents of  2 , return the small number.

Example

Input:
7
12
Output:
8
Explanation:

Exponents of 2 in:

7-0

8-3

9-0

10-1

11-0

12-2

Hence maximum exponent if two is of 8.

*/


package AccentureQuestion.src;

import java.util.Scanner;

public class MaxExponents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit or starting number : ");
        int a = sc.nextInt();
        System.out.print("Enter the upper limit or ending number  : ");
        int b = sc.nextInt();

        System.out.print("The maximum Exponents is = " + maxE(a, b));
    }

    public static int maxE(int a, int b){
        int maxCount  = 0;
        int result = 0;
        for(int i=a; i<= b; i++){
            String str = binary(i);
            int tempCount = 0;
            int j=str.length()-1;
            while(j != 1){

                int n = str.charAt(j) - '0';
                if(n == 0){
                    tempCount++;
                }
                j--;

            }
            if(tempCount > maxCount ){
                maxCount = tempCount;
                result = i;
            }
        }
        return result;
    }

    public static String binary(int i){
        int temp = i;
        String str = "";
        while(temp > 0){
            int x = temp % 2;
            str = x + str;
            temp /= 2;
        }
        return str;
    }
}
