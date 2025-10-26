package Array_Question.Easy_Level;

public class TofindMaxElement {
    public static void main(String[] args) {
        int[] arr1 = {2, 4, 6, -2, 8, 8, 100, 100};
        int[] arr2 = {3, 3, 3, 3, 3};

        System.out.println("Second largest element in arr1: " + secMax(arr1));
        System.out.println("Third largest element in arr1: " + thirdMax(arr1));

        System.out.println("Second largest element in arr2: " + secMax(arr2));
        System.out.println("Third largest element in arr2: " + thirdMax(arr2));
    }

    // Method to find the second maximum element
    public static int secMax(int[] arr) {
        Integer max1 = null, max2 = null;

        for (int num : arr) {
            if ((max1 != null && num == max1) || (max2 != null && num == max2)) continue;

            if (max1 == null || num > max1) {
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max2 = num;
            }
        }

        // Return largest if second max does not exist
        return (max2 != null) ? max2 : max1;
    }

    // Method to find the third maximum element
    public static int thirdMax(int[] arr) {
        Integer max1 = null, max2 = null, max3 = null;

        for (int num : arr) {
            if ((max1 != null && num == max1) ||
                    (max2 != null && num == max2) ||
                    (max3 != null && num == max3)) continue;

            if (max1 == null || num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (max2 == null || num > max2) {
                max3 = max2;
                max2 = num;
            } else if (max3 == null || num > max3) {
                max3 = num;
            }
        }

        // Return largest if third max does not exist
        return (max3 != null) ? max3 : max1;
    }
}
