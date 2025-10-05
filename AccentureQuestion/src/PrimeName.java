/*
 Prime Name
Problem Statement:
The task is to find if a name is a "Prime Name". To test if a set of characters is prime,
calculate the sum of the ASCII values of the characters. If the sum is a prime number,
the name is considered a "Prime Name", otherwise, it is not.

Input: A string of maximum 100 characters.
Output: "Prime Name" or "NOT a Prime Name".

Note: Do not consider the ASCII value of any embedded spaces
 */
package AccentureQuestion.src;

import java.util.Scanner;

public class PrimeName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name :");
        String name = sc.nextLine();
        System.out.println("The given name "+ name+ " is a valid Prime Name = "+ isPrime(name));
    }
    public static boolean isPrime(String name){
        name = name.trim();
        name = name.replaceAll(" ", "");
        char[] arr = name.toCharArray();
        int sum = 0;
        for(int i=0; i< arr.length; i++){
            char ch = arr[i];
            sum += (int)ch;
        }
        if(sum == 0 || sum == 1) return false;

        for(int i=2; i<= Math.sqrt(sum); i++){
            if(sum % i== 0){
                return false;
            }
        }
        return true;
    }
}
