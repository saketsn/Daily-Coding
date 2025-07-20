package DSClass.src;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 45,6,23,56,78,2,32};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void Bubble(int[] arr){
        int n= arr.length;
        boolean swapped;

        for(int i=0; i<n; i++){
            swapped = false;
            for(int j=0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if( swapped == false){
                break;
            }
        }

    }
}
