package DSClass.src;

public class fibonaci {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibo(3));
    }

    public static int fibo(int n){
        if(n==0 ){
            return 0;
        }
        if(n==1){
            return 1;
        }
        
        return fibo(n-1) + fibo(n-2);
    }
}
