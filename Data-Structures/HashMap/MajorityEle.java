import java.util.*;
public class MajorityEle {

    public static void main(String args[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={1,2,3,2,1,1,1,3,5};

        for(int i=0;i<arr.length;i++){

            // int num=arr[i];
            // if(map.containsKey(num)){
            //     map.put(num,map.get(num)+1);
            // }else{
            //     map.put(num,1);
            // }

            //Shortly

            map.put(arr[i],map.getOrDefault(arr[i],0)+1); 
            //get or default function returns the value or the default value if the key dont exist
        }

        // Set<Integer> keys=map.keySet();
        // for(Integer k:keys){
        for(Integer k : map.keySet()){      //Instead of Storing the keyset separately we can directly use it in loop
            if(map.get(k) > (int)arr.length/3){
                System.out.println(k);
            }
        }
    }
    
}
