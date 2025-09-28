/*
Problem Statement :

Given two arrays of integers, return merged sorted array.

Input: arr1 = [1, 2, 3, 4, 5],
       arr2 = [2, 4, 6, 8, 10]

Output: [1, 2, 2, 3, 4, 4, 5, 6, 8, 10]

*/
package AccentureQuestion.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter the element of the arr1 :");
        for(int i=0; i< n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array : ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter the element of the arr2 :");
        for(int i=0; i< m; i++){
            arr2[i] = sc.nextInt();
        }
        System.out.println("Final sorted array is :");

        System.out.println(Arrays.toString(sort(arr1, arr2)));


    }

    public static int[] sort(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> list = new ArrayList<>();

        int i=0;
        int j=0;
        while(i<arr1.length && j< arr2.length){
            if(arr1[i]== arr2[j]){
                list.add(arr1[i]);
                list.add(arr2[j]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                list.add(arr1[i]);
                i++;
            }else{
                list.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            list.add(arr1[i++]);
        }
        while (j < arr2.length) {
            list.add(arr2[j++]);
        }
        int[] finalArr = new int[arr1.length+ arr2.length];
        for(int k=0; k< finalArr.length; k++){
            finalArr[k] = list.get(k);
        }
        return finalArr;
    }
}
