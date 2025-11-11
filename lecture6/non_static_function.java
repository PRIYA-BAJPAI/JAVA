package lecture6;

public class non_static_function {
    //non static method
    void salutation(){
        System.out.println("hello");
    }
    public static void main(String[] args){
        non_static_function obj=new non_static_function();
        obj.salutation();
    }
}
