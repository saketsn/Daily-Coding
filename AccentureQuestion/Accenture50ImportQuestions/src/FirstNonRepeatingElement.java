package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the array :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The first Non-Repeating Element is = "+ result(arr));

    }
    public static int result(int[] arr){
        int n= arr.length;
        int res = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num : arr){
            if(map.get(num) == 1){
                res = num;
                break;
            }
        }
        return res;
    }
}
