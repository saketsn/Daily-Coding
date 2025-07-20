package DSClass.src;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {45, 6, 23, 56, 78, 2, 32};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr){
        int n= arr.length;

        for(int i=0; i< n; i++){
            int key = arr[i];
            int j= i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }
    }
}
