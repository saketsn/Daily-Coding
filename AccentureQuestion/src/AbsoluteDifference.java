package AccentureQuestion.src;

import java.util.Scanner;

public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size the an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the element in the Array :");
        for(int i=0; i< arr.length; i++){
            System.out.println("Enter the element at position "+i+" :");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        System.out.println("Enter the diff : ");
        int diff = sc.nextInt();
        System.out.println("Final Answer is : "+ sol(arr, num, diff));

    }

    public static int sol(int[] arr, int num, int diff){
        int count = 0;

        for(int n : arr){
            int temp = Math.abs(n-num);
            if(temp <= diff ){
                count++;
            }
        }
        if(count <1){
            return -1;
        }
        return count;
    }
}
