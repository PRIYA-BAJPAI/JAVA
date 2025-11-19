package lecture9;

abstract class Animal{
        abstract void eat();
    }
    class Dog extends Animal{
        void eat(){
            System.out.println("Rich Dog eat dog food");
        }
    }

public class abstraction {
    //abstract class always inherit
    public static void main(String[] args){
    Animal s1=new Dog();
    s1.eat();
}
}
