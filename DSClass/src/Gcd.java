package DSClass.src;

public class Gcd {
    public static void main(String[] args) {
        System.out.println("GCD of given two integers is = " + findGcd(49, 78));
    }

    public static int findGcd(int a, int b) {
        if (b == 0) return a;
        return findGcd(b, a % b);  
    }
}
