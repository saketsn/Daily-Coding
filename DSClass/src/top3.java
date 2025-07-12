package DSClass.src;

public class top3 {
    public static void main(String[] args) {
        int arr[] = { 50, 10, 20, 30, 40 };
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 ) {
                max3 = max2;
                max2 = arr[i];
            } else if (arr[i] > max3 ) {
                max3 = arr[i];
            }
        }

        System.out.println("Max1 = " + max1);
        System.out.println("Max2 = " + max2);
        System.out.println("Max3 = " + max3);
    }
}
