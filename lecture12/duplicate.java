package lecture12;
import java.util.HashSet;
public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        //int i=0;
        HashSet<Integer>set=new HashSet<>();  //hashset do not contain duplicate elements
        for(int i :arr){
           if(!set.contains(i)){
            System.out.println(false);
            break;
           }
           set.add(i);
            System.out.println(true);
           
        }
        //System.out.println(false);
        
    }
}
