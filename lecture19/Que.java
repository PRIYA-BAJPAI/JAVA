package lecture19;
import java.util.*;
public class Que {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(8);
        int res=list.stream().filter(n->n>5 && n%2!=0).reduce(0,(a,b)->a+b);
        
        System.out.println(res);
        // System.out.println(mapRes);
        // System.out.println(data);
    }
}
