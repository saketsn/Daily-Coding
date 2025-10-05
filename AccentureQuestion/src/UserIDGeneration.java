/*
 User ID Generation
Problem Statement:
Generate a user-id using the participant's First_Name, Last_Name, PIN code, and a number N, following these steps:

Determine Smaller/Longer Name: Compare the lengths of First_Name and Last_Name. The shorter is the 'Smaller Name', t
he longer is the 'Longer Name'. If lengths are equal, the one that is alphabetically first is the 'Smaller Name'.

Construct User-ID: The user-id is formed by concatenating:

Last letter of the smaller name.

The entire longer name.

The N-th digit of the PIN from the left.

The N-th digit of the PIN from the right.

Toggle Case: Toggle the case of all alphabets in the generated user-id (uppercase to lowercase and vice-versa).

Example 1:

Input: First_Name = Rajiv, Last_Name = Roy, PIN = 560037, N = 6

Output: YrAJIV75

Explanation: Smaller name is "Roy", longer is "Rajiv". ID = y + Rajiv + 7 + 5 -> yRajiv75. Toggled: YrAJIV75.

Example 2:

Input: First_Name = Manoj, Last_Name = Kumar, PIN = 561327, N = 2

Output: RmANOJ62

Explanation: Names are equal length. "Kumar" is alphabetically first. Smaller is "Kumar", longer is "Manoj". ID = r + Manoj + 6 + 2 -> rManoj62. Toggled: RmANOJ62.
 */
package AccentureQuestion.src;

public class UserIDGeneration {
    public static void main(String[] args) {

    }
}
