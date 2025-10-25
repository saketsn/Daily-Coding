package Array_Question.Easy_Level;

public class SecondMaxElement {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, -2, 77, 8, 100};
        System.out.println("Second largest element is : "+ secMax(arr));
    }

    public static int secMax(int[] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }else if(arr[i] > max2 && arr[i] < max1){
                max2 = arr[i];
            }
        }
        return max2;
    }

}
