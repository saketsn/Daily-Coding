package DSClass.src;

public class factorial {
    public static void main(String[] args) {
        System.out.println(sum(0));
    }
    public static int sum(int n){
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
    }
}
