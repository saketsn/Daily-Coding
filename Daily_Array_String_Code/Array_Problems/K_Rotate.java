/*
Rotate array by K positions (left/right rotation)
Question: Rotate an Array by K Positions (Left / Right Rotation)
Problem Statement

Given an array of integers and an integer K, rotate the array by K positions.

In left rotation, elements are shifted to the left.

In right rotation, elements are shifted to the right.

Definitions

Left Rotation by K:
Each element moves K positions to the left. Elements that fall off from the beginning appear at the end.

Right Rotation by K:
Each element moves K positions to the right. Elements that fall off from the end appear at the beginning.

Examples

Example 1: Left Rotation

Input:
Array: [1, 2, 3, 4, 5]
K = 2

Output:
[3, 4, 5, 1, 2]

Explanation:
After rotating left by 2 positions, the first two elements move to the end.

Example 2: Right Rotation

Input:
Array: [1, 2, 3, 4, 5]
K = 2

Output:
[4, 5, 1, 2, 3]

Explanation:
After rotating right by 2 positions, the last two elements move to the front.

Important Considerations

If K is greater than the array length, rotate by K % N, where N is the array size.

Rotation should preserve the order of elements.

Clarify whether rotation should be done in-place or using extra space.

Constraints

1 ≤ N ≤ 10⁵

0 ≤ K ≤ 10⁹

Time & Space Complexity (Expected)

Time Complexity: O(N)

Space Complexity: O(1) for in-place rotation
 */
package Daily_Array_String_Code.Array_Problems;

import java.util.Arrays;

public class K_Rotate {
    public static void main(String[] args){
        int[] arr = { 23, 4, 25, 78, 9, 10};
        //int[] arr= {7, 7, 7};
        int k= 2;
        System.out.println(Arrays.toString(arr));
        rightRotate(arr,k);
        System.out.println("Arrays after Right rotation : " +Arrays.toString(arr));
        System.out.println(Arrays.toString(arr));
        leftRotate(arr, k);
        System.out.println("Arrays after left rotation : " +Arrays.toString(arr));
    }

    public static void rightRotate(int[] arr,int k){
        int n = arr.length;
        k= k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr, k,n-1);


    }

    public static void leftRotate(int[] arr, int k){
        int n= arr.length;
        k = k%n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    public static void reverse(int[] arr, int start, int end) {
          while(start< end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
          }
    }

}
