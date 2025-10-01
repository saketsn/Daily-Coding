/*

Print first K words
Example

Input: "Hello I am a passionate developer"
    k: 3
Output:Hello I am
*/

package AccentureQuestion.src;

import java.util.Scanner;

public class kwords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String or sentence : ");
        String str = sc.nextLine();
        System.out.print("Enter the value of k :");
        int k = sc.nextInt();

        words(str, k);
    }

    public static void words(String str,int k){
        if( k > str.length()){
            System.out.println("K value should not be more than length of string .");;
        }
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String[] st = str.split(" ");
        for(int i=0; i< k; i++){
            System.out.print(st[i] + " ");
        }
    }
}
