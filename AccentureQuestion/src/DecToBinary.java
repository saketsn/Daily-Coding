package AccentureQuestion.src;

import java.util.Scanner;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.print("The Binary conversion of "+ n+ " is = " + sol(n));
    }

    private static String sol(int n){
        String str = "";
        while(n > 0){
            int temp = n % 2;
            str = str+temp;
            n /= 2;

        }
        String re ="";
        for(int i= str.length()-1; i>= 0; i--){
            re = re+ str.charAt(i);
        }

        return re;
    }
}
