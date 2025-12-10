package lecture14;
import java.io.*;
public class file_handeling {
    public static void main(String[] args) {
        try{   //file creation
            File file=new File("home.html");
            if(file.createNewFile()){
                System.out.println("done"+file.getName());
            }else{
                System.out.println("already file created");
            }
        }catch(Exception e){
            System.out.println(e);
        }
    //     static void createData(){
    //         try{
    //             FileWriter writer=new FileWriter("home.html");
    //             writer.write("hello new file data");
    //             writer.close();
    //         }
    //     }catch(Exception e){
    //         System.out.println(e);
    //     }
    // }
    
}
}
