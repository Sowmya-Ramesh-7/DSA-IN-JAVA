import java.util.HashMap;

public class HashMapOperation {

    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>(); // creating an hashMap

        //all hashmap operations is performed in the constant operation

        hm.put("India", 100); // to add elements into hashMap put method is used
        hm.put("China", 300);
        System.out.println(hm);

        int indiaPop=hm.get("India"); // get method return the value of the key passed
        System.out.println(indiaPop);
        System.out.println(hm.get("US")); // returns null if the key is empty
        System.out.println(hm);


        //containsKey checks if the key exist then returns true else false
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("US"));
        System.out.println(hm);


        //remove method inside which the key is passed
        //if the key is not present the if reurns a null value
        System.out.println(hm.remove("china")); // key is case sensitive 
        System.out.println(hm.remove("China")); // returns the removed value
        System.out.println(hm.containsKey("China"));
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.isEmpty());
        hm.clear();
        System.out.println("Is empty after clear : "+hm.isEmpty()); //clears the elments from hashMap




    }
}
