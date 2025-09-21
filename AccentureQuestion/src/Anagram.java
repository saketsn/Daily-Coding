package AccentureQuestion.src;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first line :");
        String s = sc.nextLine();

        System.out.println("Enter the second line :");
        String t = sc.nextLine();

        System.out.println("Given Strings "+ s + " and " + t + " are isAnagram = " + isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t){
        s = s.replaceAll("\\s","").toLowerCase();
        t = t.replaceAll("\\s","").toLowerCase();

        if(s.length() != t.length()) return false;

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);

    }
}
