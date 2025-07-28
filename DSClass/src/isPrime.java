package DSClass.src;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(   isPrime(5));
        System.out.println(   isPrime(10));

    }
    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2; i*i <= n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
