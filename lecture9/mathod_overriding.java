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
    void data(){
        System.out.println("hello");
    }
}
public class  mathod_overriding{
    public static void main(String[] args) {
        // Dog S1=new Dog();  
        // S1.eat();
        // S1.data();
        Animal s1=new Dog();  //upcasting
        s1.eat();
        Dog s2=(Dog)s1;  //down casting
        s2.eat();
    }
}