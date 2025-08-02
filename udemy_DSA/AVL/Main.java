package udemy_DSA.AVL;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(result(n));
    }

    public static int result(int n){
        int sum =0;
        if(n > n){
            return 0;
        }
        return n+result(n+1);
    }

}
