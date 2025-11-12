// 3. Create a class BankAccount with fields accountNumber, accountHolder, and balance. Implement methods to deposit and withdraw money.
package lecture7;
class BankAccount{
    int accno;
    String accholder;
    float balance;
    void deposit(float bal){
        bal=balance;
        float amt=1000;
        float a=bal+amt;
        System.out.println("Amount deposited");
        System.out.println("available balance is "+ a);
    }
    void withdraw(float bal){
        bal=balance;
        float amt=100;
        float a=bal-amt;
        if(bal<amt){
            System.out.println("No sufficient money");
        }else{
            System.out.println("Amount withdrawn succesfully");
            System.out.println("available balance is " + a);
        }
    }
}
public class bank {
    public static void main(String[] args) {
        BankAccount obj=new BankAccount();
        obj.deposit(5000);
        obj.withdraw(5000);
    }
}
