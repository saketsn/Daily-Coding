/*
Robot Position
Problem Statement:
You have a robot at the origin (position 0) of an x-axis.
The robot follows a string of instructions. For every i-th instruction,
the position ‘p’ of the robot is modified as follows:

L: move one unit left (decrease p by 1).

R: move one unit right (increase p by 1).

A digit j: perform the same action as the j-th instruction (where j < i).

You are given a function Int FindPosition(char* instr);. Implement it to find the final position of the robot.

Assumptions:

Initial position is 0.

L and R are uppercase.

Instructions only contain L, R, and digits 0-9.

Example:

Input: LR1RL2

Output: 2
 */
package AccentureQuestion.src;



import java.util.Scanner;

public class RobotPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the instruction string: ");
        String instr = sc.nextLine();
        int finalPosition = findPosition(instr);
        System.out.println("Final Position: " + finalPosition);
        sc.close();
    }

    public static int findPosition(String instr) {
        int n = instr.length();
        int[] move = new int[n];  // Store effect of each instruction
        int position = 0;

        for (int i = 0; i < n; i++) {
            char c = instr.charAt(i);

            if (c == 'L') {
                move[i] = -1;
            } else if (c == 'R') {
                move[i] = 1;
            } else if (Character.isDigit(c)) {
                int j = c - '0';  // Convert char digit to integer
                if (j < i) {
                    move[i] = move[j];  // Repeat the j-th instruction
                } else {
                    // Invalid case (digit refers to a future instruction)
                    move[i] = 0;
                }
            }

            position += move[i];  // Update robot position
        }

        return position;
    }
}

