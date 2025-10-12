package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        count(str);
    }

    public static void count(String str){
        int vowel = 0;
        int cons = 0;
        for(int i=0; i< str.length(); i++){
            char ch = str.toLowerCase().charAt(i);
          if(ch >= 'a' && ch <= 'z') {
              if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                  vowel++;
              } else {
                  cons++;
              }
          }

        }
        System.out.print("The number of vowels are : "+ vowel);
        System.out.println();
        System.out.print("The number of consonants are : "+ cons);
    }
}
