package lecture6;

public class variable {
    static int a=5;    //static variable
    int b=10;    //non static variable
    public static void main(String[] args){
        System.out.println(a);
        variable obj=new variable();
        System.out.println(obj.b);

    }
}
