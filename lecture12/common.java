package lecture12;
import java.util.HashSet;
public class common {
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        int arr1[]={2,3,4,5};
        HashSet<Integer>set=new HashSet<>();
        HashSet<Integer>result=new HashSet<>();

        for(int x:arr){
            set.add(x);
        }
        for(int y:arr1){
            if(set.contains(y)){
                result.add(y);
            }
        }
        System.out.println(result);
    }
}
