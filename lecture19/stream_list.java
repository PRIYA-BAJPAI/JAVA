package lecture19;

import java.util.*;

public class stream_list {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer>res=list.stream().filter(n->n>3).toList();
        List<Integer>mapRes=list.stream().map(n->n*2).toList();
        int  data=list.stream().reduce(0,(a,b)->a+b);
        System.out.println(res);
        System.out.println(mapRes);
        System.out.println(data);

    }
}
