/*
Eight Queens Puzzle Verification
Problem Statement:
The task is to verify the status of 8 Queens placed on a Chess Board.
The input is an 8x8 matrix of 0s and 1s, where 0 represents an empty
square and 1 represents a square occupied by a queen. We need to verify
if the eight queens are placed safely, meaning no two queens threaten
each other (they are not in the same row, column, or diagonal).

Input: An 8x8 matrix.
Output: "Valid" or "Invalid".

Example 1 (Valid):

0 0 0 1 0 0 0 0
0 0 0 0 0 0 1 0
0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 1
0 1 0 0 0 0 0 0
0 0 0 0 1 0 0 0
1 0 0 0 0 0 0 0
0 0 0 0 0 1 0 0
Output: Valid

Example 2 (Invalid):

1 0 0 0 0 0 0 0
0 0 0 1 0 0 0 0
0 1 0 0 0 0 0 0
0 0 0 0 1 0 0 0
0 0 1 0 0 0 0 0
0 0 0 0 0 0 0 1
0 0 0 0 0 1 0 0
0 0 1 0 0 0 0 0
Output: Invalid
 */
package AccentureQuestion.src;



import java.util.Scanner;

public class EightQueensPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[8][8];
        System.out.println("Enter the position of queens (enter 1 for queen, 0 for empty):");

        // Step 1: Read 8x8 input
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 2: Print the board
        print(arr);

        // Step 3: Check if valid
        if (isValid(arr))
            System.out.println("Output: Valid");
        else
            System.out.println("Output: Invalid");

        sc.close();
    }

    // Method to print chessboard
    public static void print(int[][] arr) {
        System.out.println("\nChessboard:");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to check if placement is valid
    public static boolean isValid(int[][] board) {
        int queensCount = 0;

        // Step 1: Check total queens
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 1)
                    queensCount++;
            }
        }
        if (queensCount != 8) return false;

        // Step 2: Check each queen’s safety
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 1) {
                    if (!isSafe(board, i, j)) return false;
                }
            }
        }
        return true;
    }

    // Helper method to check if a queen at (row, col) is safe
    public static boolean isSafe(int[][] board, int row, int col) {
        // Check same row
        for (int j = 0; j < 8; j++) {
            if (j != col && board[row][j] == 1) return false;
        }

        // Check same column
        for (int i = 0; i < 8; i++) {
            if (i != row && board[i][col] == 1) return false;
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < 8; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        // Check lower-left diagonal
        for (int i = row + 1, j = col - 1; i < 8 && j >= 0; i++, j--) {
            if (board[i][j] == 1) return false;
        }

        // Check lower-right diagonal
        for (int i = row + 1, j = col + 1; i < 8 && j < 8; i++, j++) {
            if (board[i][j] == 1) return false;
        }

        // If no conflicts found, it's safe
        return true;
    }
}
