package AccentureQuestion.src;

import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the binary number :");
        String st = sc.nextLine();

        System.out.println("Converted Decimal of the given Binary number is = "+ sol(st));

    }

    public static int sol(String st){
        int num = Integer.parseInt(st);

        if(num == 0) return 0;

        int finalNum = 0;
        int exp = 0;

        int temp = num;
        while(temp > 0){
            int tempDigit = temp%10;
            finalNum += tempDigit * Math.pow(2, exp);
            exp++;

            temp = temp/10;
        }

        return finalNum;
    }
}
