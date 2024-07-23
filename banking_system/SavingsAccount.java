package banking_system;

public class SavingsAccount extends Account<String> {

    private double interestRate;

    public SavingsAccount(Integer accountNumber, double balance, String accountHolder, double interestRate) {
        super(accountNumber, balance, accountHolder);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountNumber=" + getAccountNumber() +
                ", balance=" + getBalance() +
                ", accountHolder=" + getAccountHolder() +
                ", interestRate=" + interestRate +
                '}';
    }
}
