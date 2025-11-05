//input datatype
import java.util.Scanner;
public class input{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your int value");
        int a=sc.nextInt();
        System.out.println(a);
        System.out.println("Enter your float value");
        float b=sc.nextFloat();
        System.out.println(b);
        System.out.println("Enter your string value");
        String str=sc.next();
        System.out.println(str);
        sc.close();
    }
}