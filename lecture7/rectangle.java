// 2. Create a class Rectangle with length and breadth as fields. Add methods to calculate area and perimeter. Create objects with different values and call those methods
package lecture7;
class rec{
    int length;
    int breadth;
    void area(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        int area=length*breadth;
        System.out.print("Area : ");
        System.out.println(area);
    }
    void perimeter(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        int perimeter=2*(length+breadth);
        System.out.println("Perimeter"+" "+perimeter);
    }
}
public class rectangle {
    public static void main(String[] args) {
        rec obj=new rec();
        obj.area(5,6);
        obj.perimeter(5,6);
    }
}
