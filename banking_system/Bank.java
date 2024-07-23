package banking_system;

import java.util.ArrayList;
import java.util.List;

public class Bank<T extends Account<String>> {

    private List<T> accounts = new ArrayList<>();

    public void addAccount(T account) {
        accounts.add(account);
    }

    public T getAccount(Integer accountNumber) {
        for(T account : accounts) {
            if(account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
