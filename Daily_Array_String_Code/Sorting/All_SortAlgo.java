package Daily_Array_String_Code.Sorting;

public class All_SortAlgo {
    public static void main(String[] args) {
        // int arr[] = {7, 8, 3, 2, 1};
        int arr[] = {6, 3, 9, 5, 2, 8};
        //bubbleSort(arr);
        //selectSort(arr);
//        mergeSort(arr, 0, arr.length-1);

        quickSort(arr, 0, arr.length-1);
        print(arr);

    }

    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    // Bubble Sort algo
    // time complexity O(n^2)
    public static void bubbleSort(int[] arr){

        int n= arr.length;
        for(int i=0; i< n-1; i++){
            for(int j=0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selection Sort
    // time -
    public static void selectSort(int[] arr){
        int n = arr.length;
        for(int i=0; i< n; i++){
            int minIndex = i;
            for(int j= i+1; j< n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }

    }

    public static  void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void mergeSort(int[] arr, int s, int e){
        if(s>=e) return ;

        int mid = s + (e-s)/2;
        mergeSort(arr, s, mid);
        mergeSort(arr, mid+1, e);
        merge(arr, s, mid, e);


    }

    public static void merge(int[] arr, int s, int mid, int e){
        int[] temp = new int[e-s+1];
        int i= s;
        int j = mid+1;
        int k=0;

        while(i<= mid && j <= e){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=e){
            temp[k++] = arr[j++];
        }
        for(k=0, i=s; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static int partion(int[] arr, int low, int high){
            int pivot = arr[high];
            int i = low-1;

            for(int j= low; j< high; j++){
                if(arr[j] < pivot){
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            i++;
            int temp = arr[i];
            arr[i] = pivot;
            arr[high] = temp;
            return i;
    }

    public static void quickSort(int[] arr, int low, int high){
            if(low < high){
                int pidx = partion(arr, low , high);

                quickSort(arr, low, pidx-1);
                quickSort(arr, pidx+1, high);
            }
    }
}
