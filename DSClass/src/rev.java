package DSClass.src;

public class rev {

    public static void rev(int arr[]) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        print(arr);
    }

    public static void rev2(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = arr[i];
            arr[i] = temp;
        }
        print(arr);
    }

    // Method to print the array
    public static void print(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method to test rev and rev2
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println("Using rev:");
        rev(array1);

//        int[] array2 = {10, 20, 30, 40, 50};
//        System.out.println("Using rev2:");
//        rev2(array2);
    }
}

