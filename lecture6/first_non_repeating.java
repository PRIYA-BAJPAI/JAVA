package lecture6;
// import java.util.Scanner;
public class first_non_repeating {
    void repeat(){
        String a="abac";
        int i;
        int j;
        for(i=0;i<a.length();i++){
        for(j=i;j<a.length();j++){
            if(a.charAt(j)==a.charAt(i)){
                break;
            }
        }

    }
    System.out.println(a.charAt(i));
    
    }
    public static void main(String[] args) {
        first_non_repeating obj=new first_non_repeating();
        obj.repeat();
        // System.out.println();
    }
}
