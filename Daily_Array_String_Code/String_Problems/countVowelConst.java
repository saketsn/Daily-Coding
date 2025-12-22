/*
Count vowels and consonants in a string

 */
package Daily_Array_String_Code.String_Problems;

import java.util.Scanner;

public class countVowelConst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        count(str);
    }

    public static void count(String str){
        str = str.toLowerCase();
        int vowel =0;
        int conso = 0;
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel++;
            }else{
                conso++;
            }
        }
        System.out.println("Vowel = "+ vowel);
        System.out.println("Consonants = "+ conso);

    }
}
