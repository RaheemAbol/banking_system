package banking_system;

public class Transaction<T extends Account<String>> {

    private T account;
    private double amount;
    private boolean isDeposit;

    public Transaction(T account, double amount, boolean isDeposit) {
        this.account = account;
        this.amount = amount;
        this.isDeposit = isDeposit;
    }


    public void execute(){
        if(isDeposit){
            account.deposit(amount);
        }else{
            account.withdraw(amount);
        }
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "account=" + account +
                ", amount=" + amount +
                ", isDeposit=" + isDeposit +
                '}';
    }
}
