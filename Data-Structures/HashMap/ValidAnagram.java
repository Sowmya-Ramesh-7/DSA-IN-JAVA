import java.util.HashMap;

public class ValidAnagram {

    /*if 2 string are made up of same number and value of characters then they are anagram */
    public static boolean isAnagram(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        for(int i=0;i<t.length();i++){
            Character ch=t.charAt(i);
            if(map.get(ch)==null){
                return false;
            }else {
                /*
                if(map.get(ch)==0){  
                    map.remove(ch);
                }
                {e=2, k=1, n=1}
                {e=2, k=0, n=1}
                {e=2, k=0, n=0}
                {e=1, k=0, n=0}
                {e=0, k=0, n=0}
                when there is only one element remove it not when it 0 elements
                because we have to take another loop to remove 0 valued elements
                s= keen and t= knee is anagram: false
                 */

                if(map.get(ch)==1){  
                    map.remove(ch);
                    System.out.println(map);
                }else{
                    map.put(ch,map.get(ch)-1);
                    System.out.println(map);
                }
            }
        }
        return map.isEmpty();

    }

    public static void main(String args[]){
        String s="lipid";
        String t="tulip";
        System.out.println("s= keen and t= knee is anagram: "+isAnagram(s,t));


    }

    
}
