public class length {
    public static void main(String[] args){
        String str="Java is powerful";
        String count=str;
        int max=0;
        String a[]=str.split(" ");  //jaha space milega waha se string split ho jayega
                for(String str1 : a){
                    if(str1.length()>max){
                        max=str1.length();
                        count=str1;
                    }   
                }
                System.out.println(count);

    }
}
