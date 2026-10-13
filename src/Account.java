import java.time.LocalDate;

public class Account {
    String acountId;
    double balance;
    float rate;
    LocalDate date;
    //int minBalance =500;

    public Account() {
    }

    public Account(String acountId, double balance, float rate) {
        this.acountId = acountId;
        this.balance = balance;
        this.date = LocalDate.now();
        this.rate = rate;
    }

    void deposit (double amount){

        this.balance=this.balance +amount;
    }
    double withdraw(double amount){
        if(amount > balance)
            throw new OverDrawnExpetion();
        this.balance =this.balance - amount;
        return amount;
    }
    void checkBalance(){
        System.out.println("Balance is: "+balance);
    }


    public void displayDetails() {
        System.out.println( "Account{" +
                "acountId='" + acountId + '\'' +
                ", balance=" + balance +
                ", rate=" + rate +
                ", date=" + date +
                '}');
    }

    public static void main(String[] args) {
        Account ac=new Account("101",1000,2.5f);

        ac.displayDetails();
        System.out.println("Deposit 100");
        ac.deposit(100);
        ac.checkBalance();



        try {
            System.out.println("Trying withraw  amount ");
            ac.withdraw(ac.withdraw(1200));
            ac.checkBalance();
        }catch (OverDrawnExpetion oe){
            System.out.println("Exception Caught "+oe.getMessage());
        }


    }

}
