package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class numberOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        System.out.println("The number of words :"+ count(str));
    }
    public static int count(String str){

        str = str.trim();

        String[] arr = str.split("\\s+");
        if(arr.length == 0) return 0;

        return arr.length-1;

    }
}
