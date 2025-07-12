package DSClass.src;

import java.util.Arrays;

public class binarySearch{
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, -20, 0,81};
        Arrays.sort(arr);
        System.out.println("\n");
        print(arr);
        int target = 0;
        int start = 0;
        int end = arr.length - 1;

        int res = binaryS(arr, target, start, end);
        System.out.println("Given element is at index = " +res);
    }

    static void print(int arr[]){
        System.out.println();

        for(int a: arr){
            System.out.print(a + " ,");

        }
        System.out.println();

    }

    static int binaryS(int arr[], int target, int start, int end) {
        if(start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(target < arr[mid]) {
            return binaryS(arr, target, start, mid-1);
        }else{
            return binaryS(arr, target, mid+1, end);
        }
    }
}