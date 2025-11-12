package lecture7;
class Car{
    int a;
    Car(int a){
        this.a=a;    //this.a instant variable ko point karta hai aur without this yadi kuchh likha hai to wo local variable ko point karta hai
         System.out.println(a);
    }
}
public class instant_parameter {
    public static void main(String[] args) {
        Car obj=new Car(5);
       
    }
}
