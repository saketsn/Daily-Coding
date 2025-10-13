package StringQuestions.EasyLevel20Qs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        freq(str);
    }
    public static void freq(String str){
        str = str.trim();
        str = str.replaceAll("\\s+","");
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i< str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet() ){
            System.out.println(entry.getKey()+ " -> "+ entry.getValue());
        }

        System.out.println("\nPrinting using forEach():");
        map.forEach((k, v) -> System.out.println(k + " → " + v));

    }
}
