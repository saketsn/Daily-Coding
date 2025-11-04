package ApnaCollege_DSA.Sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 2, 1};
        //bubbleSort(arr);
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Bubble Sort algo
    // time complexity O(n^2)
    public static void bubbleSort(int[] arr){

        int n= arr.length;
        for(int i=0; i< n-1; i++){
            for(int j=0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort
    // time -
    public static void selectSort(int[] arr){
        int n = arr.length;
        for(int i=0; i< n; i++){
            int minIndex = i;
            for(int j= i+1; j< n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

    }

    // Bucket sort
    public static void insertionSort(int[] arr){
        int n = arr.length;
    }
}
