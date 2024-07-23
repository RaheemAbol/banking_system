package banking_system;

public class Account<T> {

    private Integer accountNumber;

    private double balance;

    private T accountHolder;

    public Account(Integer accountNumber, double balance, T accountHolder) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolder = accountHolder;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public T getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(T accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= balance){
            balance -= amount;
        }else{
            System.out.println("Insufficient balance");
        }

    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", accountHolder=" + accountHolder +
                '}';
    }
}
