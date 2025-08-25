package DSClass.src;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
*/



import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args) {

        int[] arr = new int[] {0, 3, 0, 24, 5, 0, 6};

        moveZeroes(arr);  // call method

        System.out.println(Arrays.toString(arr));  // print nicely
    }

    public static void moveZeroes(int[] nums) {
        int j = 0; // position to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Fill the rest with zeros
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}

