/*
You have been given an integer N as input . your task is to write a
program to print N rows of Floyad’s Triangle. Floyd's pattern is a right-
angled triangular array of natural numbers , used for the numbering of
lines In a printout
.
For N=4,
1
23
456
78910

 */

package AccentureQuestion.src;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the a number :");
        int n = sc.nextInt();

        triangle(n);

    }
    private static void triangle(int n){

        int v = 1;
        for(int i=0; i< n; i++){
            for(int j = 0; j<= i; j++){
                System.out.print(v++);
            }
            System.out.println();
        }
    }

}
