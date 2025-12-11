package lecture18;
class MyThread extends Thread{
    public void run(){ //inbuilt method to make thread 1
        System.out.println("hello");
        for(int i=0;i<5;i++){
            System.out.println(i+"t1");
            try{
                Thread.sleep(2000); //2 sec ke liye is thread ko pause karega phir run karega
                //agar aur koi thread bhi available hai to wo pehle run ho jayegi kyuki use pause nhi kiya hai phir last me poora thread run hoga 2 sec ke gap me
            }catch(Exception e){

            }
        }
    }
}
public class sleep_method {
    public static void main(String[] args) {  //first thread (main thread)
        System.out.println(Thread.currentThread().getName()); //to get the name of thread that is running
        MyThread t1=new MyThread();  //to call the 2nd thread
        t1.start();  //this forms multithread  if we use run() compiler will consider run an a normal method and form single thread
       
        for(int i=0;i<5;i++){
            System.out.println(i+"main");
             
        }
    }
}
    

