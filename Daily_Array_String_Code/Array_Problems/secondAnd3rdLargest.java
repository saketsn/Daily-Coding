/*
Find Second Largest element in an array


Find Third Largest element in an array

 */
package Daily_Array_String_Code.Array_Problems;

public class secondAnd3rdLargest {
    public static void main(String[] args){
        int[] arr = { 23, 4, 25, 78, 9, 10};
        //int[] arr= {7, 7, 7};

        System.out.println("Second largest is = " + secondLargest(arr));
       // System.out.println("3rd largest is = " + thirdLargest(arr));
    }
    private static int secondLargest(int[] arr){
        if(arr == null || arr.length < 2){
            throw new  IllegalArgumentException("Array must contain 2 elements");
        }
       int max1 = Integer.MIN_VALUE;
       int max2 = Integer.MIN_VALUE;
       for(int i=0; i< arr.length; i++){
           if(arr[i] > max1){
               max2 = max1;
               max1 = arr[i];
           }else if(arr[i] < max1 && arr[i] > max2){
               max2 = arr[i];
           }
       }
        if (max2 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }
       return max2;
    }

    private static int thirdLargest(int[] arr){
        if(arr == null || arr.length < 3){
            throw new IllegalArgumentException("Array must contain at least 3 elements");
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }else if(num < max1 && num > max2){
                max3 = max2;
                max2 = num;
            }else if(num < max2 && num > max3){
                max3 = num;
            }
        }
        if(max3 == Integer.MIN_VALUE){
            throw new IllegalArgumentException("3rd largest element does not exits in the given array.");
        }
         return max3;

    }
}
