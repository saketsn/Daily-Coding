package ApnaCollege_DSA.Recursion;

public class PrintDec {
    public static void main(String[] args) {
       // print(10);
        System.out.println();
        System.out.println(squreNum(4));
    }

    public static void print(int n){
        if(n==1){
            System.out.print(n);
            return ;
        }
        System.out.print(n+ " ");
        print(n-1);

    }

    public static int squreNum(int n){
        if(n == 1){
            return 2;
        }
        return 2 * squreNum(n-1);
    }
}
