package DSClass.src;

public class binarySearch{
    public static void main(String[] args) {
        //int arr[] = {1, -1, 3, -20, 0,81};
        int arr[] = {0, 6, 5, 0, 0, 2, };
        question(arr);

        //bubbleSort(arr);
        //selectionSort(arr);
        System.out.println("\n");
        print(arr);
        int target = 0;
        int start = 0;
        int end = arr.length - 1;

//        int res = binaryS(arr, target, start, end);
//        System.out.println("Given element is at index "+ target+ " = " +res);
    }

    static void print(int arr[]){
        System.out.println();

        for(int a: arr){
            System.out.print(a + " ,");

        }
        System.out.println();

    }

    static int binaryS(int arr[], int target, int start, int end) {
        if(start > end) {
              return -1;
        }

           int mid = (start + (end - start)) / 2;

         if(arr[mid] == target) {
             return mid;
        }

         if(target < arr[mid]) {
            return binaryS(arr, target, start, mid-1);
        }else{
            return binaryS(arr, target, mid+1, end);
        }
    }

    public static void bubbleSort(int[] arr) {
         int n = arr.length;
           boolean swapped;
        for (int i = 0; i < n - 1; i++) {
             swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
             if (!swapped) break;
        }
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0; i< n; i++){

            int minIndex = i;

            for(int j=i+1; j< n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex =j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex]  = temp;
        }
    }

    public static void question(int[] arr){
        int n= arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i]== 0 || arr[i+1] == 0){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        print(arr);
    }



}