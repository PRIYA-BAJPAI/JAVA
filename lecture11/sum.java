package lecture11;
import java.util.*;
public class sum {
    public static void main(String[] args) {
        int arr[]={2,3,4,5};
        HashMap<Integer,Integer>map=new HashMap<>();
        int target=9;
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i]; //difference find karenge
            if(map.containsKey(diff)){ //agar diff ki value map me hai to loop chalega 
                System.out.println(map.get(diff)+" "+i); 
                break;
            }
            map.put(arr[i],i); //otherwise map map create hoga 
        }
        }
}
