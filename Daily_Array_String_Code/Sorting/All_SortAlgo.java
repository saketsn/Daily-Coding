package Daily_Array_String_Code.Sorting;

public class All_SortAlgo {
    public static void main(String[] args) {
        // int arr[] = {7, 8, 3, 2, 1};
        int arr[] = {6, 3, 9, 5, 2, 8};
        //bubbleSort(arr);
        //selectSort(arr);
        mergeSort(arr, 0, arr.length-1);
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
}
