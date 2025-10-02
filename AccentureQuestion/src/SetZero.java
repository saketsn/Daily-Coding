/*
Problem Statement

Given an m * n integer matrix , if an element is 0, set its entire row and column to 0.

Input: matrix = [[1,1,1],
                 [1,0,1],
                 [1,1,1]]

Output: matrix = [[1,0,1],
                  [0,0,0],
                  [1,0,1]]

*/
package AccentureQuestion.src;

import java.util.Scanner;

public class SetZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Row  m : ");
        int m = sc.nextInt();
        System.out.print("Enter the value of Column  n : ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Enter the element of matrix ");

        for(int i=0; i< m; i++){
            for(int j=0; j <n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        print(arr);
        System.out.println();
        zero(arr);
        System.out.println();
        print(arr);



    }
    public static void zero(int[][] arr){
        int r= arr.length;
        int c = arr[0].length;

        int[] rowlen = new int[r];
        int[] columnlen = new int[c];

        for(int i=0; i< r; i++){
            for(int j=0; j<c; j++){
                if(arr[i][j] == 0){
                    rowlen[i] = 1;
                    columnlen[j] = 1;

                }
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(rowlen[i] == 1 || columnlen[j] == 1){
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void print(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
