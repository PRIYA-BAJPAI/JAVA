package lecture18;
class MyThread extends Thread{
    public void run(){ //inbuilt method to make thread 1
        System.out.println("hello");
        for(int i=0;i<5;i++){
            System.out.println(i+"t1");
        }
    }
}
public class join_method {
    public static void main(String[] args) {  //first thread (main thread)
        System.out.println(Thread.currentThread().getName()); //to get the name of thread that is running
        MyThread t1=new MyThread();  //to call the 2nd thread
        t1.start();  //this forms multithread  if we use run() compiler will consider run an a normal method and form single thread
        try{
            t1.join();  //method to maintain the sequence of calling this function says to pause the calling of main function while t1 is not complete
        }catch(Exception e){

        }
        for(int i=0;i<5;i++){
            System.out.println(i+"main");
        }
    }
}
