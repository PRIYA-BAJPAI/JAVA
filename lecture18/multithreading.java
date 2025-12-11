package lecture18;
class MyThread extends Thread{
    public void run(){ //inbuilt method to make thread 1
        System.out.println("hello");
        for(int i=0;i<5;i++){
            System.out.println(i+"t1");
        }
    }
}
public class multithreading {
    public static void main(String[] args) {  //first thread (main thread)
        System.out.println(Thread.currentThread().getName()); //to get the name of thread that is running
        MyThread t1=new MyThread();  //to call the 2nd thread
        t1.start();  //this forms multithread  if we use run() compiler will consider run an a normal method and form single thread
        for(int i=0;i<5;i++){
            System.out.println(i+"main");
        }
    }
}
//there will be random calling of classes
