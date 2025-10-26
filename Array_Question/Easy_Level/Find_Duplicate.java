/*
Problem Statement: Find Duplicate Number in the Range 1 to N

Given:

An array of integers nums of size n+1, where each integer is in the range 1 to n (inclusive).

There is only one duplicate number, but it could be repeated more than once.

Task:

Find the duplicate number in the array.

You cannot modify the original array.

Try to solve it using constant extra space and efficient time complexity if possible.

Input:

An integer array nums of length n+1

Each element in nums is in the range [1, n]

Output:

A single integer representing the duplicate number

Example 1
Input: nums = [1,3,4,2,2]
Output: 2

Example 2
Input: nums = [3,1,3,4,2]
Output: 3

Constraints

1 <= n <= 10^5

nums.length == n + 1

All elements are in the range 1 to n

Only one duplicate exists but can appear multiple times
 */
package Array_Question.Easy_Level;

import java.util.HashSet;

public class Find_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.print("Duplicate number is :"+ duplicate(arr));
    }

    public static int duplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        Integer result = null;
        for(int num : arr){
            if(set.contains(num)){
                result = num;
                break;
            }
            set.add(num);


        }


        return (result != null) ? result : -1;

    }

}
