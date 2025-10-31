/*
Problem Statement: Find Elements That Appear Only Once

You are given an integer array nums.
Your task is to find all elements that appear exactly once in the array.

Return the elements that appear only once in any order.

 Example 1

Input:

nums = [4,3,2,4,1,3,2]


Output:

[1]


Explanation:
All elements except 1 appear more than once.
 */
package Array_Question.Easy_Level;

import java.util.HashMap;

public class ElementAppearOnce {
    public static void main(String[] args) {
        int[] arr = {4,3,2,4,1,3,2};
        System.out.println("The element tha appear only one time is : "+ once(arr));

    }
    public static int once(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : arr){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        int result = -1;
        for(int n : arr){
            if(map.get(n) == 1){
                result = n;
            }
        }
        return result;
    }
}
