/*

GIven an array, find the number of occurences of each element in the array.

Sample Test Case 2:
Input:
arr[] = {10,5,10,15,10,5}

Output:
10 - 3
5 - 2
15 - 1

*/

package AccentureQuestion.src;

import java.util.HashMap;
import java.util.Scanner;

public class ElementOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array :");
        for(int i=0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        count(arr);
    }

    private static void count(int[] arr){
        HashMap<Integer, Integer> res = new HashMap<>();

        for(int num : arr){
            res.put(num, res.getOrDefault(num,0)+1);
        }

        for (int key : res.keySet()) {
            System.out.println(key + " - " + res.get(key));
        }
    }
}
