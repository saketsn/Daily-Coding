package TCSQuestions.src;

import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a String :");
        String str = sc.nextLine();


        System.out.println(reVowels(str));
        System.out.println(reSpace(str));
        System.out.println(reString(str));
    }

    static String reVowels(String str){
        StringBuffer sb = new StringBuffer();

        for(int i=0; i< str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(str.charAt(i)); // keep original character (preserve case)
            }

        }
        return sb.toString();
    }


    static String reSpace(String str){
        StringBuffer sb = new StringBuffer();

        for(int i=0; i< str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch != ' ') {
                sb.append(str.charAt(i)); // keep original character (preserve case)
            }

        }
        return sb.toString();
    }

    static String reString(String str){
        StringBuffer sb = new StringBuffer();

        for(int i= str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        return  sb.toString();
    }

}