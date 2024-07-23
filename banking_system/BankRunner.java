package banking_system;

public class BankRunner {

    public static void main(String[] args) {
        Bank<SavingsAccount> chaseBank = new Bank<>();
        SavingsAccount savingsAccount1 = new SavingsAccount(12345,1000.0,"Jim",0.02);
        chaseBank.addAccount(savingsAccount1);

        Bank<CheckingAccount> citiBank = new Bank<>();
        CheckingAccount checkingAccount1 = new CheckingAccount(5678,500.0,"Jenny",1000.0);
        citiBank.addAccount(checkingAccount1);

        Transaction<SavingsAccount> savingDeposit = new Transaction<>(savingsAccount1,200.0,true);
        savingDeposit.execute();


        Transaction<CheckingAccount> checkingWithdrawal = new Transaction<>(checkingAccount1,100.0,false);
        checkingWithdrawal.execute();



        System.out.println("Savings Account balance: " + savingsAccount1.getBalance());

        System.out.println("Savings Account balance: " + checkingAccount1.getBalance());

        System.out.println("Retrieved Account :" + chaseBank.getAccount(12345));
        System.out.println("Retrieved Account :" + citiBank.getAccount(5678));

    }
}
