package DSClass.src;

public class SumPair {
    public static void main(String[] args) {
        //int[] arr = {1, 2, 3};
       int[] arr = {1, 2, 3};
        int[] [] arr1= { {1} , {1,2}, {1,2,3},{2}, {2,3} , {3}};
        System.out.println(sum(arr));
    }





        public static int sum(int[] arr) {
            int n = arr.length;
            int total = 0;
            for (int i = 0; i < n; i++) {

                total += arr[i] * (i + 1) * (n - i);
            }
            return total;
        }



}
