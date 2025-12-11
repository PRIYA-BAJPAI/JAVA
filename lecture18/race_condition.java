package lecture18;
class Bank{
    int balance=100;
    synchronized void withdraw(int amt){
        System.out.println(Thread.currentThread().getName()+"checking balance ..");
        if(balance>=amt){
             
        }
    }
}
public class race_condition {
    
}
