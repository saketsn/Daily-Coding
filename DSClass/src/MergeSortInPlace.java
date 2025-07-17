package DSClass.src;

public class MergeSortInPlace {
    static void merge(int arr[], int l, int m, int r){
        // Sizes of two subarrays
        int n1 = m - l + 1;
        int n2 = r - m;

        // Temporary arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy elements to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge temp arrays back into arr[l..r]
        int i = 0, j = 0;
        int k = l;  // Starting index to overwrite original array

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Recursive MergeSort function
    static void mergeSort(int arr[], int l, int r){
        if (l < r) {
            // Middle point (to prevent overflow)
            int m = l + (r - l) / 2;

            // Recursively sort two halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // Driver code
    public static void main(String args[]){
        int arr[] = {38, 27, 43, 10};

        mergeSort(arr, 0, arr.length - 1);

        // Print sorted array
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}