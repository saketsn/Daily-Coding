/*
Problem Statement

Write a Java program to find the intersection of two sorted arrays.

The intersection of two arrays includes all elements that are common to both arrays.

If an element occurs more than once in both arrays, it should appear in the intersection as many times as it appears in both.

Assume both input arrays are sorted in non-decreasing order.

Example

Input:
arr1 = [1, 2, 2, 3, 4]
arr2 = [2, 2, 3, 5]

Output:
2 2 3
 */

package AccentureQuestion.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of arr1: ");
        int n = sc.nextInt();
        System.out.print("Enter the size of arr2: ");
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        System.out.print("Enter the elements of arr1: ");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        int[] arr2 = new int[m];
        System.out.print("Enter the elements of arr2: ");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        List<Integer> result = intersection(arr1, arr2);

        System.out.print("The intersection of given two arrays is: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static List<Integer> intersection(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return list;
    }
}
