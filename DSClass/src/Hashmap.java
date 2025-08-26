package DSClass.src;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 110);

        System.out.println(map);

        //search
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }else{
            System.out.println("Key is not present in the map");
        }

//        System.out.println(map.get("China"));
//        System.out.println(map.get("INdo"));
//
//        for(Map.Entry<String, Integer> e: map.entrySet()){
//            System.out.println(e.getKey());
//            System.out.println(e.getValue());
//        }
//
//        Set<String> keys = map.keySet();
//        for(String key : keys){
//            System.out.println(key + " " + map.get(key));
//        }

        map.remove("China");
        System.out.println(map);


    }
}
