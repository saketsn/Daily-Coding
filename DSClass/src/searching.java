package DSClass.src;

public class searching {
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, -20, 0,81};
        System.out.println( search(arr, 3));
    }

    static int search(int arr[], int target){
        for(int i=0; i< arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
