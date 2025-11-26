import java.util.*;

public class freq_count {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int ar[]={2,2,3,4,2,4,2};
        for(int x:ar){
            map.put(x,map.getOrDefault(x, 0)+1); //jab key x ke equal hoga aur value me kuchh na ho to 0+1 hoga otherwise previous value +1 hoga
        }
        for(int x:map.keySet()){
            System.out.print(x+"->");
            System.out.println(map.get(x));
        }
        }
}
