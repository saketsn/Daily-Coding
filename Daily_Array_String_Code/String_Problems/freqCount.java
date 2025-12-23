package Daily_Array_String_Code.String_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class freqCount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();
        count(str);
    }
    private static void count(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i< str.length();i++){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
