/*
Remove all white spaces from a string
 */
package Daily_Array_String_Code.String_Problems;

import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String  :");
        String str = sc.nextLine();
        System.out.println(str);
        str = remove(str);
        System.out.println(str);
        String result = toggleCase(str);
        System.out.println(result);
    }

    public static String remove(String str){
        return  str.replaceAll("\\s+","");
    }

    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
