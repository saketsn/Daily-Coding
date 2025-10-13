package StringQuestions.EasyLevel20Qs;

import java.util.Scanner;

public class CountUppercaseLowercaseDigitsSpecialCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        count(str);
    }
    public static void count(String str){
        int up = 0;
        int low = 0;
        int digit = 0;
        int special = 0;
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z' ){
                low++;
            }else if(ch >= 'A' && ch <= 'Z'){
                up++;
            }else if(ch - '0' >= 0 && ch - '0' <= 9){
                digit++;
            }else{
                special++;
            }
        }
        System.out.print("\nNumber of UpperCase character is : "+up);
        System.out.print("\nNumber of lowerCase character is : "+low);
        System.out.print("\nNumber of digit is : "+ digit);
        System.out.print("\nNumber of special character is : "+ special);
    }
}
