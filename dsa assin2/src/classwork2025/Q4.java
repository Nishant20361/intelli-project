package classwork2025;
class deposit{
    long principle;
    int time;
    double rate;
       double total_amt;
    deposit(){
        principle=0;
        time=0;
        rate=0.0;
        total_amt=0.0;
    }
    deposit(long p,int t,double r){
        principle=p;
        time=t;
        rate=r;
        total_amt();
    }
    deposit(long p,int t) {
        principle = p;
        time = t;
        rate = 5.0;
        total_amt();
    }
    deposit(long p,double r) {
        principle = p;
        time = 2;
        rate = r;
        total_amt();
    }

    void total_amt(){
        total_amt=principle+(principle*rate*time)/100;
    }
    void display(){
        System.out.println();
        System.out.println("Principal: " + principle);
        System.out.println("Time: " + time);
        System.out.println("Rate: " + rate);
        System.out.println("Total Amount: " + total_amt);
    }
    }
public class Q4 {
    public static void main(String[] args) {
        deposit d1=new deposit();
        deposit d2=new deposit(4000,2,3.0);
        deposit d3= new deposit(2456,1);
        deposit d4=new deposit(6775,4.0);
        System.out.println("Deposit 1:");
        d1.display();
        System.out.println("\nDeposit 2:");
        d2.display();
        System.out.println("\nDeposit 3:");
        d3.display();
        System.out.println("\nDeposit 4:");
        d4.display();
    }
}
