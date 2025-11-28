package lecture12;
import java.util.LinkedHashSet;
public class linkedhashset {
    public static void main(String[] args){
        LinkedHashSet<Integer> set=new LinkedHashSet<>();  //order maintained
        set.add(20);
        set.add(40);
        System.out.println(set);
    }
}
