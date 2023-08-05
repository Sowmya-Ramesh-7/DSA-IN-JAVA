import java.util.*;
public class IterateHashMap {
    
    public static void main(String args[]){
        //iteration over the HashMap
        //hashmaps has a method called keySet(), that makes a set or collection of the keys and returns it when its called
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 300);
        System.out.println(hm);
        //keySet()
        Set<String> keys=hm.keySet(); //unordered
        System.out.println(keys);
        for(String k:keys){
            System.out.println(hm.get(k));
        }
        System.out.println(hm.entrySet());
        Set<Map.Entry<String,Integer>> pair=hm.entrySet();
        System.out.println(pair);
    }
    
}
