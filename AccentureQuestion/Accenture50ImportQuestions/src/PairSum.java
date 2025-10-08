package AccentureQuestion.Accenture50ImportQuestions.src;

import java.util.HashMap;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1};
        int target = 11;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

       for(int num : arr){
           int comple = target -num;

           if(map.containsKey(comple)){
               count += map.get(comple);
           }

           map.put(num, map.getOrDefault(num, 0)+1);
       }

        System.out.println("Count of pairs is " + count);
    }
}
