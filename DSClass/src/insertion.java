package DSClass.src;

public class insertion {
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, -20, 0, 81};
        insertSort(arr);
    }

    public static void insertSort(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

        printArr(arr);
    }

    static void printArr(int arr[]) {
        for (int a : arr) {
            System.out.print(a + " ,");
        }
        System.out.println();
    }

    public void selectSort(int arr[]){
        int n = arr.length;
        for(int i=0; i< n; i++){
            int minIndex = i;

            for(int j = i+1; j< n; j++){
                if(arr[j]< arr[minIndex]){
                    minIndex =j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[minIndex];
            arr[minIndex] = temp;
        }

        printArr(arr);

    }
}
