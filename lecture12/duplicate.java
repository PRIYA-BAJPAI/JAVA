package lecture12;
import java.util.HashSet;
public class duplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        HashSet<Integer>set=new HashSet<>();
        for(int i :arr){
           if(set.contains(i)){
            System.out.println(true);
           }
           set.add(i);
            System.out.println(false);
           
        }
       
    }
}
