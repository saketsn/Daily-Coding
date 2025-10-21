/*
Problem Statement: Tiling Problem

You are given a floor of size 2 × n and tiles of size 2 × 1.
You need to count the number of ways to completely fill the floor with these tiles.

You can place each tile either:

Vertically (covering 2 rows and 1 column), or

Horizontally (covering 1 row and 2 columns).

Return the total number of ways to fill the floor.

🧠 Example 1

Input:

n = 1


Output:

1


Explanation:
Only one way — place one tile vertically.

🧠 Example 2

Input:

n = 2


Output:

2


Explanation:
Two ways —
1️⃣ Place two tiles vertically side by side.
2️⃣ Place two tiles horizontally stacked on top of each other.

🧠 Example 3

Input:

n = 3


Output:

3


Explanation:
1️⃣ All vertical,
2️⃣ Two horizontal + one vertical,
3️⃣ One vertical + two horizontal.
 */
package ApnaCollege_DSA.Recursion;

import java.util.Scanner;

public class Tiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n in 2 x n size :");
        int n = sc.nextInt();
        System.out.println("The count of the number of ways to completely fill the floor with these tiles : " + count(n));
    }
    public static int count(int n){
        if(n==0 || n==1){
            return 1;
        }
        return count(n-1) + count(n-2);
    }
}
