/*
char*MoveHyphen(char str[],int n);

The function accepts a string “str” of length ‘n’, that contains alphabets and
hyphens (-). Implement the function to move all hyphens(-) in the string to the
front of the given string.

NOTE:- Return null if str is null.

Example :-

Input:
str.Move-Hyphens-to-Front
Output:
—MoveHyphenstoFront
Explanation:-

The string “Move-Hyphens -to-front” has 3 hyphens (-), which are moved to the front of the string, this output is “— MoveHyphen”

Sample Input

Str: String-Compare
Sample Output-

-StringCompare


 */

package AccentureQuestion.src;

import java.util.Scanner;

public class MoveHyphen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a String with hyphens : ");;
        String str = sc.nextLine();

        System.out.println(result(str));
    }

    public static String result(String str){
        if(str== null) return null;
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        String str1 = "";
        String str2 = "";

        for(int i=0; i< str.length(); i++){
            Character ch = str.charAt(i);
            if(ch == '-'){
                str1 =  str1 + ch;
            }else{
                str2 = str2+ ch;
            }
        }
        String res = str1 + str2;
        return res;
    }
}
