package banking_system;

public class CheckingAccount extends Account<String> {

    public double overdraftLimit;

    public CheckingAccount(Integer accountNumber, double balance, String accountHolder, double overdraftLimit) {
        super(accountNumber, balance, accountHolder);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "accountNumber=" + getAccountNumber() +
                ", balance=" + getBalance() +
                ", accountHolder=" + getAccountHolder() +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}
