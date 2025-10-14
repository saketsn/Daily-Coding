package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string :");
        String str = sc.nextLine();
        System.out.println("Longest word in the given string is :"+ word(str));
    }

    public static String word(String str){
        str = str.trim();

        String[] arr = str.split("\\s+");
        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            if(max < arr[i].length()){
                max = i;
            }
        }

        return arr[max];
    }
}
