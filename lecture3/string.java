public class string {
     public static void main(String[] args){
        String str=new String("hello");  //new stores string in different objects
        String str1=new String("hello");
        System.out.println(str==str1);            //we are comparing objects and objects are always unique for different strings but since the strings are same hence two different pointers points same address
        
        System.out.println(str.equals(str1));     //here each elements of strings are compared hence output is true   
     }
}
