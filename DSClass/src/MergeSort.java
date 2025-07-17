package DSClass.src;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {38, 27, 43, 10};
        int start = 0;
        int end = arr.length-1;
        System.out.println(end);
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left, right);
    }


    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];

        int i=0,j=0, k=0;

        while(i< first.length && j< second.length){
            if(first[i] < second[j]){
                mix[k++] = first[i++];
            }else{
                mix[k++] = second[j++];
            }
        }
        while (i< first.length){
            mix[k++] = first[i++];
        }
        while (j< second.length){
            mix[k++] = second[j++];
        }

        return mix;
    }

}
