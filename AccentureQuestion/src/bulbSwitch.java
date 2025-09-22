/*
Problem Statement :

N light bulbs are connected by a wire. Each bulb has a switch associated with it, however due to faulty wiring, a switch also changes the state of all the bulbs to the right of current bulb. Given an inital state of all bulbs, Find the minimum number of switches you have to press to turn on all the bulbs. You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.

Note: A[] = [0 1 0 1]
Output: 4

Explanation:
Press switch 0: [1 0 1 0] //1
Press switch 1: [1 1 0 1] //2
Press switch 2: [1 1 1 0] //3
Press switch 3: [1 1 1 1] //4

Input: A[] = [1 0 0 0 0]
Output: 1

*/

package AccentureQuestion.src;

import java.util.Scanner;

public class bulbSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = sc.nextInt();

        int[] bulb = new int[n];
        System.out.println("Enter the 0 OR 1 for bulb in array : ");
        for(int i=0; i<n; i++){
            bulb[i] = sc.nextInt();
        }

        System.out.println("Total number of switch ON or OFF will take to switch ON all the bulbs = " + sol(bulb, n));
    }

    private static int sol(int[] bulb, int n){
        int count =0;
        for(int i=0; i<n; i++){
            if(bulb[i] == 0){
                bulb[i] = 1;
                for(int j= i+1; j<n; j++){
                    if(bulb[j] == 0){
                        bulb[j] = 1;
                    }else{
                        bulb[j] = 0;
                    }
                }
                count++;
            }
        }
        return count;
    }
}
