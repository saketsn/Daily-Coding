package DSClass.src;

import java.math.BigInteger;

public class bigint {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(33);
        BigInteger B = new BigInteger("123242323232");

        BigInteger s = B.add(A);
        System.out.println(s);


    }
}
