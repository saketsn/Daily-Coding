package DSClass.src;

import java.util.Arrays;

public class mergeTwoSortedArray {
    public static void main(String[] args) {

        int[] arr1 ={2, 4, 5,6,7,8};
        int[] arr2 ={23,23,445,65431,2,-1};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int l1= arr1.length;
        int l2= arr2.length;
        int[] arr3 = new int[l1+l2];
        merge(arr1,arr2,arr3);
    }


//    public static void merge(int[] arr1, int[] arr2, int[] arr3){
//        int i=0, j=0, k=0;
//
//        while(i < arr1.length){
//            arr3[k++] = arr1[i++];
//        }
//        while(j < arr2.length){
//            arr3[k++] = arr1[j++];
//        }
//        Arrays.sort(arr3);
//        printArr(arr3);
//    }

    public static void merge(int[] arr1, int[] arr2, int[] arr3){

        int n1= arr1.length;
        int n2= arr2.length;
        int i=0, j=0, k=0;

        while(i < n1 && j<n2){
            if(arr1[i] < arr2[j]){
                arr3[k++] =arr1[i++];
            }else{
                arr3[k++] = arr2[j++];
            }
        }

        while(i<n1){
            arr3[k++] =arr1[i++];
        }
        while(j<n2){
            arr3[k++] = arr2[j++];
        }
        printArr(arr3);
    }

    static void printArr(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ,");
        }
        System.out.println();
    }
}
