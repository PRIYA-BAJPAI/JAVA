import java.util.*;
public class hash_map {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1, 10);  //put data in map
        map.put(2, 10);  //key is always unique
        System.out.println(map);
        System.out.println(map.get(1));//if key equal to zero is present return its value otherwise return null
        System.out.println(map.getOrDefault(11, 0)); //this is to find whether a key =11 is available in hash map or not and if it is not present return 0 otherwise return value of that key
        for(int x:map.keySet()){
            System.out.println(map.get(x));
        }
    }
}
