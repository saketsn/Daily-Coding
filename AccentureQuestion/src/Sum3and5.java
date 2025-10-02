/*

Problem Statement           (Asked in Accenture Offcampus 2 Aug 2021, Slot 3)

You are required to implement the following function:

Int Calculate(int m, int n);

The function accepts 2 positive integer ‘m’ and ‘n’ as its arguments.
You are required to calculate the sum of numbers divisible both by 3 and 5,
between ‘m’ and ‘n’ both inclusive and return the same.
Note
0 < m <= n

Example

Input:
m : 12
n : 50

Output
90

Explanation:
The numbers divisible by both 3 and 5, between 12 and 50 both inclusive are {15, 30, 45} and their sum is 90.
Sample Input
m : 100
n : 160
Sample Output
510

*/
package AccentureQuestion.src;

import java.util.Scanner;

public class Sum3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower value of range :");
        int m = sc.nextInt();
        System.out.println("Enter upper value of range :");
        int n = sc.nextInt();

        int lcm = lcm(3,5);
        int sum = 0;
        for(int i= m; i<= n; i++){
            if( i%lcm == 0){
                sum += i;
            }
        }
        System.out.println("The sum = "+ sum);
    }
    public static int gcd(int a, int b){
        if(b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return (Math.abs(a) / gcd(a, b)) * Math.abs(b);
    }
}
