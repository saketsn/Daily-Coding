package DSClass.src;

import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Number of digit that evenly divide the entered number is : " + evenlyDivides(num));
    }


        static int evenlyDivides(int n) {

            int count = 0;
            int org = n;
            while(org>0){
                int temp = 0;
                temp = org % 10;
                if(temp != 0 && n % temp == 0){
                    count++;
                }
                org = org/10;
            }

            return count;
        }

}
