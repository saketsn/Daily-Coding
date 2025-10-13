package StringQuestions.EasyLevel20Qs;

import java.util.Arrays;
import java.util.Scanner;

public class TwoStringsAreAnagrams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st string :");
        String str1 = sc.nextLine();
        System.out.print("Enter 2nd string :");
        String str2 = sc.nextLine();

        System.out.println("The given 2 string is Anagram :"+ isAnagram(str1, str2));
    }
    public static boolean isAnagram(String str1, String str2){
        str1 = str1.replaceAll("\\s+","").toLowerCase();
        str2 = str2.replaceAll("\\s+","").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        if(arr1.length != arr2.length) return false;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);


    }
}
