/*
Mr. Akshay Kumar is the manager at the Holiday  hotel. The hotel has an infinite
amount of rooms.One fine day, a finite number of tourists come to stay at the hotel.
The tourists consist of:
→ A Group Leader.
→ An unknown group of families consisting of K members per group where K ≠1.
The Group Leader was given a separate room, and the rest were given one room per group.
Mr. Akshay has an unordered list of randomly arranged room entries. The list consists of the
room numbers for all of the tourists. The room numbers will appear K times per group except for
the Group Leader’s room.
Mr. Akshay needs you to help him find the Group Leader’s room number.
The total number of tourists or the total number of groups of families is not known to you.
You only know the value of K and the room number list.
Input Format
The first line consists of an integer, K, the size of each group.
The second line contains the unordered elements of the room number list.
Output Format
Output the Group Leader’s room number.
Sample Input
5
1 2 3 6 5 4 4 2 5 3 6 1 6 5 3 2 4 1 2 5 1 4 3 6 8 4 3 1 5 6 2
Sample Output
8
 */
package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.HashMap;
import java.util.Scanner;

public class FindUniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        System.out.print("Enter the value of K :");
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array :");
        for(int i=0; i< n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Group leader's room number is : "+room(arr));
    }
    public static int room(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(int num : arr){
            if(map.get(num) == 1 ){
                return num;
            }
        }
        return -1;
    }
}
