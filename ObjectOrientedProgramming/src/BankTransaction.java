class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit :" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("withdraw :" + amount);
        } else {
            System.out.println("insufficient balance !");
        }
    }

    public void displayBalance() {
        System.out.println("Account :" + accountNumber + "Balance :" + balance);
    }
}
class SavingsAccount extends BankAccount{
    public SavingsAccount(String accountNumber,double balance){
        super(accountNumber,balance);
    }
}
class CheckingAccount extends BankAccount{
    public CheckingAccount(String accountNumber,double balance){
        super(accountNumber,balance);
    }
}
public class BankTransaction {
    public static void main(String[] args) {
        SavingsAccount savings=new SavingsAccount("9447330568",1000);
        CheckingAccount checking=new CheckingAccount("9447330568",800);
        savings.deposit(500);
        savings.withdraw(300);
        savings.displayBalance();

        System.out.println("----------------------------");

        checking.deposit(200);
        checking.withdraw(800);
        checking.displayBalance();
    }
}
