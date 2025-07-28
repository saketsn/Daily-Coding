package DSClass.src;


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
       // Arrays.sort(arr);
    }

//    static void sort(int[] nums, int low, int hi) {
//        if (low >= hi) {
//            return;
//        }
//
//        int s = low;
//        int e = hi;
//        int m = s + (e - s) / 2;
//        int pivot = nums[m];
//
//        while (s <= e) {
//
//
//            while (nums[s] < pivot) {
//                s++;
//            }
//            while (nums[e] > pivot) {
//                e--;
//            }
//
//            if (s <= e) {
//                int temp = nums[s];
//                nums[s] = nums[e];
//                nums[e] = temp;
//                s++;
//                e--;
//            }
//        }
//
//
//        sort(nums, low, e);
//        sort(nums, s, hi);
//    }

    private static void sort(int[]arr,int low, int high){
        int s = low;
        int e = high;
        int pivot = arr[low];  //pivot = first element    #####################

        if(low >= high) return;

        while(s <= e){
            while(arr[s] < pivot) s++;

            while(arr[e] > pivot) e--;

            while(s <= e){
                int temp = arr[s];
                arr[s++] = arr[e];
                arr[e--] = temp;
            }
        }

        sort(arr, low, e);
        sort(arr, s, high);
    }




}
