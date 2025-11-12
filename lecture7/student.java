//1. Create a class Student with fields name, rollNumber, and marks. Write a method to display student details. Create 3 student objects and display their data
package lecture7;
class Student{
    String name;
    int rollno;
    int marks;
    Student(String name,int rollno,int marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
}
public class student {
    public static void main(String[] args) {
        Student obj=new Student("ram",12,95);
        System.out.println(obj.name);
        System.out.println(obj.rollno);
        System.out.println(obj.marks);
    }
}
