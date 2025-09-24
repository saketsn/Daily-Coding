/*
Problem Statement :

Print the first K words of the string.

Input: Hello I am a passionate developer
       k = 4

Output: Hello I am a

*/

package AccentureQuestion.src;

import java.util.Scanner;

public class FirstKWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string :");
        String str = sc.nextLine();

        System.out.print("Enter the value of K :");
        int k = sc.nextInt();

        System.out.print("Output is = "+ solution(str, k));
    }
    private static String solution(String str,int k){
        String[] res = str.split("\\s+");

        if(k > res.length ){
            return str;
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i< k; i++){
            sb.append(res[i]);
            if(i < k-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
