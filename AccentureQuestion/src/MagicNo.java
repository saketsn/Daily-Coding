/*

Find count of magical numbers from 1 to N
A number is magical if:
    Convert to binary.
    Replace 0 with 1 and 1 with 2 in binary string.
    Calculate sum of all digits in binary string.
    Resultant must be an odd number

Eg:
    Input: N = 5
    Output: 2

Explanation:
    1 -> Binary = 1  -> convert to = 2   sum = 2 (even)
    2 -> Binary = 10 -> convert to = 21  sum = 3 (odd)
    3 -> Binary = 11 -> convert to = 22  sum = 4 (even)
    4 -> Binary = 100 -> convert to = 211 sum = 4 (even)
    5 -> Binary = 101 -> convert to = 212 sum = 5 (odd)

*/
package AccentureQuestion.src;

import java.util.Scanner;

public class MagicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N = ");
        int n = sc.nextInt();

        System.out.print("The number of Magical number in given  n is = "+ count(n));

    }

    public static int count(int n){

        int count =0;
        for(int i=1; i<= n; i++){
            int sum = 0;

            sum = binary(i);
            if(sum % 2 != 0){
                count++;
            }
        }
        return count;
    }

    public static int binary(int i){
        int temp =i;
        String str = "";
        while(temp > 0){
            str = (temp%2) + str;
            temp /= 2;
        }
        int binNumber = Integer.parseInt(str);
        int sum = convert01(binNumber);
        return sum;
    }

    public static int convert01(int binNumber){
        int sum = 0;
        int x = binNumber;
        while(x>0){
            int t = x%10;
            if(t == 0){
                t= 1;
                sum += t;
            }
            if(t==1){
                t= 2;
                sum += t;
            }
            x /= 10;
        }
        return sum;
    }
}
