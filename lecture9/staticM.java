package lecture9;
class Animal{
    void eat(){
        System.out.println("animal eats pizza");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("pulav");
    }
    static void data(){
        System.out.println("hello");
    }
}
public class staticM {
    public static void main(String[] args){
        Animal s1=new Dog();  //upcasting
        s1.eat();
        Dog s2=(Dog)s1;  //down casting
        s2.data();
    }
}
