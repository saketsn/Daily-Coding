package AccentureQuestion.src;

import java.util.Scanner;

public class CountCarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number. ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number. ");
        int num2 = sc.nextInt();

        System.out.print("Total carry count is = "+ count(num1, num2));
    }

    private static int count(int num1, int num2){
        int count =0;
        int temp  = 0;
        while(num1 > 0 || num2 >0){

            int a = num1 % 10 + temp;
            num1 = num1/10;
            int b = num2 % 10 + temp;
            num2 /= 10;

            if(a+b > 9){
                count++;
                temp = 1;
            }
        }
        return count;
    }
}
