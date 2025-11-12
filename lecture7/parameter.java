package lecture7;

class Car{
    Car(String str){
        System.out.println(str);
    }
}
public class parameter {
    public static void main(String[] args) {
        Car obj=new Car("hello");
        Car obj1=new Car("hii");
    }
}
